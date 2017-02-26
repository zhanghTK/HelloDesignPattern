package tk.zhangh.pattern.memento;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.log.AopConf;

/**
 * 备忘录测试
 * Created by ZhangHao on 17/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConf.class, MementoConfig.class})
public class MementoTest {

    @Autowired
    private PositionCaretaker caretaker;

    @Test
    public void test() {
        Position position = new Position(0, 0);
        caretaker.setMemento(position.save());

        position.setPos(1, 1);
        caretaker.setMemento(position.save());

        position.setPos(2, 2);
        caretaker.setMemento(position.save());

        position.restore(caretaker.getMemento(0));
        Assert.assertEquals("position[0,0]", position.drawScreen());
    }
}