package tk.zhangh.pattern.behavior.command;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.zhangh.pattern.behavior.command.Invoker;

/**
 * 命令模式测试方法
 * Created by ZhangHao on 2016/4/13.
 */
public class CommandTest {
    ApplicationContext applicationContext;
    @Before
    public void initBeanFactory(){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testCommand(){
        // 使用spring组装命令
        Invoker invoker = applicationContext.getBean("invoker", Invoker.class);
        invoker.open();
        invoker.close();
    }
}