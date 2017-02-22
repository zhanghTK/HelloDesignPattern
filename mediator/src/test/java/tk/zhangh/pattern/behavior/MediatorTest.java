package tk.zhangh.pattern.behavior;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.log.AopConf;

import java.util.Date;

/**
 * 测试中介者模式
 * Created by ZhangHao on 17/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConf.class})
public class MediatorTest {
    private static final String MESSAGE = "hello world";
    private MessageCenter messageCenter;

    @Before
    public void init() {
        this.messageCenter = new MessageCenter();
        for (int i = 0; i < 10; i++) {
            messageCenter.register(new Person(new Date().toString()));
        }
    }

    @Test
    public void testMediator() throws Exception {
        messageCenter.contact("1", MESSAGE);
        Assert.assertEquals(MESSAGE, messageCenter.getPerson("1").getMessage());
    }
}