package tk.zhangh.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.zhangh.pattern.BusinessService;

/**
 * 日志测试
 * Created by ZhangHao on 17/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConf.class, LogTestConfig.class})
public class LogAspectTest {

    @Autowired
    private BusinessService businessService;

    @Test
    public void testLog() {
        businessService.hello("zhangh");
    }
}