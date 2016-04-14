package tk.zhangh.pattern.adapter;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 适配器测试类
 * Created by ZhangHao on 2016/4/14.
 */
public class AdapterTest {
    ApplicationContext applicationContext;
    @Before
    public void initBeanFactory(){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testAdapterClass(){
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.say();

        Target adapter = new Adapter();
        adapter.say();
    }

    @Test
    public void testAdapterObject(){
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.say();

        Target adapter = applicationContext.getBean("adapter", Adapter2.class);
        adapter.say();
    }
}