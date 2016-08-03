package tk.zhangh.pattern.behavior.chain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.log.AopConf;

/**
 * 责任链模式测试
 * Created by ZhangHao on 2016/7/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConf.class,ChainConf.class})
@ComponentScan
public class ChainTest {
    @Autowired
    @Qualifier("director")
    private Leader leader1;

    @Autowired
    private LeaveRequest leaveRequest;

    @Test
    public void testChain() {
        // 请假2天
        leaveRequest.setLeaveDays(2);
        leader1.handleRequest(leaveRequest);

        // 请假9天
        leaveRequest.setLeaveDays(9);
        leader1.handleRequest(leaveRequest);

        // 请假15天
        leaveRequest.setLeaveDays(15);
        leader1.handleRequest(leaveRequest);

        // 请假35天
        leaveRequest.setLeaveDays(35);
        leader1.handleRequest(leaveRequest);
    }
}