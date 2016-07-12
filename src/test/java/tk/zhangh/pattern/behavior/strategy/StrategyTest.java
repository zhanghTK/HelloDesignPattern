package tk.zhangh.pattern.behavior.strategy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.zhangh.pattern.behavior.strategy.Context;


/**
 * Created by zhanghao on 16/3/10.
 * 策略模式测试类
 */
public class StrategyTest {
    ApplicationContext applicationContext;
    @Before
    public void initBeanFactory(){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testStrategy(){

        // 由策略A,B构建角色
        Context context1 = applicationContext.getBean("contextStrategy1", Context.class);
        Context context2 = applicationContext.getBean("contextStrategy2", Context.class);
        Context context3 = applicationContext.getBean("contextStrategy3", Context.class);
        Context context4 = applicationContext.getBean("contextStrategy4", Context.class);

        Context[] contexts = {context1, context2, context3, context4};
        // 每个角色分别执行方法A,B,C方法
        for (Context context : contexts) {
            context.doA();
            context.doB();
            context.doC();
            System.out.println("==========");
        }
    }
}