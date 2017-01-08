package tk.zhangh.pattern.behavior.chain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.log.AopConf;

import static org.junit.Assert.assertEquals;

/**
 * 运行责任链模式
 * Created by ZhangHao on 17/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConf.class, ChainTestConfig.class})
public class ChainTest {
    @Autowired
    @Qualifier("leader1")
    private AbstractLeader leader;

    @Autowired
    @Qualifier("request2Days")
    private LeaveRequest request2Days;

    @Autowired
    @Qualifier("request9Days")
    private LeaveRequest request9Days;

    @Autowired
    @Qualifier("request15Days")
    private LeaveRequest request15Days;

    @Autowired
    @Qualifier("request35Days")
    private LeaveRequest request35Days;

    @Test
    public void test_leave_2_days() {
        assertEquals(leader.handleRequest(request2Days), "Leader1");
    }

    @Test
    public void test_leave_9_days() {
        assertEquals(leader.handleRequest(request9Days), "Leader2");
    }

    @Test
    public void test_leave_15_days() {
        assertEquals(leader.handleRequest(request15Days), "Leader3");
    }

    @Test
    public void test_leave_35_days() {
        assertEquals(leader.handleRequest(request35Days), "驳回");
    }
}