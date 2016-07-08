package tk.zhangh.pattern.chain;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class Director extends Leader{
    private Logger logger = Logger.getLogger(Director.class);

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
