package tk.zhangh.pattern.behavior.command;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.log.AopConf;

/**
 * 命令模式测试
 * Created by ZhangHao on 17/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommandTestConfig.class, AopConf.class})
public class CommandTest {

    @Autowired
    private Invoke tvInvoke;

    @Autowired
    private Invoke lightInvoke;

    @Test
    public void test_tv_up() {
        tvInvoke.up();
    }

    @Test
    public void test_tv_down() {
        tvInvoke.down();
    }

    @Test
    public void test_light_up() {
        lightInvoke.up();
    }

    @Test
    public void test_light_down() {
        lightInvoke.down();
    }
}
