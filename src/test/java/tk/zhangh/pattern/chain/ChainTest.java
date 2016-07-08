package tk.zhangh.pattern.chain;

import org.junit.Test;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ChainTest {
    @Test
    public void testChain() {
        Leader leader1 = new Director("Director");
        Leader leader2 = new Manager("Manager");
        Leader leader3 = new GeneralManager("GeneralManager");

        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);

        LeaveRequest leaveRequest = new LeaveRequest("ZhangSan", 2, "探亲");
        leader1.handleRequest(leaveRequest);

        leaveRequest.setLeaveDays(9);
        leader1.handleRequest(leaveRequest);
        leaveRequest.setLeaveDays(15);
        leader1.handleRequest(leaveRequest);
        leaveRequest.setLeaveDays(35);
        leader1.handleRequest(leaveRequest);
    }
}