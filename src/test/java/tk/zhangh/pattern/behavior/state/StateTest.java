package tk.zhangh.pattern.behavior.state;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试状态模式
 * Created by ZhangHao on 2016/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StateConf.class)
public class StateTest {
    @Autowired
    RoomContext roomContext;

    @Autowired
    @Qualifier("freeState")
    State freeState;

    @Autowired
    @Qualifier("bookedState")
    State bookedState;

    @Autowired
    @Qualifier("checkedInState")
    State checkedInState;

    @Test
    public void testState(){
        roomContext.setState(freeState);
        roomContext.setState(bookedState);
        roomContext.setState(checkedInState);
    }
}