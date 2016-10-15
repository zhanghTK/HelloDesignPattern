package tk.zhangh.pattern.behavior.chain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链中一级审核人
 * Created by ZhangHao on 2016/7/8.
 */
public class Director extends Leader{
    private Logger logger = LoggerFactory.getLogger(Director.class);

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            logger.info(String.format("员工：%s请假%s天，请假原因：%s。主任：%s审批通过",
                    request.getEmpName(), request.getLeaveDays(), request.getLeaveReason(), name));
        }else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
