package tk.zhangh.pattern.behavior.chain;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class GeneralManager extends Leader{
    private Logger logger = Logger.getLogger(GeneralManager.class);

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            logger.info(String.format("员工：%s请假%s天，请假原因：%s。总经理：%s审批通过",
                    request.getEmpName(), request.getLeaveDays(), request.getLeaveReason(), name));
        }else {
            logger.info(String.format("员工：%s请假%s天，超过请假天数上限，总经理：%s驳回",
                    request.getEmpName(), request.getLeaveDays(), name));
        }
    }
}
