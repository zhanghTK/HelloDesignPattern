package tk.zhangh.pattern.state;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试状态模式
 * Created by ZhangHao on 2016/4/20.
 */
public class StateTest {
    ApplicationContext applicationContext;
    @Before
    public void initBeanFactory(){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }


    @Test
    public void testState(){
        Context context = applicationContext.getBean("context", Context.class);
        context.request("1", "Tom");
        context.request("1", "Tom");
    }
}