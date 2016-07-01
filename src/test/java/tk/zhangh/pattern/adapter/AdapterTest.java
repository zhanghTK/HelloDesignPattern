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

    /**
     * 类适配器测试
     */
    @Test
    public void testAdapterClass(){
        // 调用正常接口
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.say();

        // 调用适配后接口
        Target adapter = new ClassAdapter();
        adapter.say();
    }

    /**
     * 对象适配器测试
     */
    @Test
    public void testAdapterObject(){
        // 调用正常接口
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.say();

        // 调用适配后接口，使用spring注入
        Target adapter = applicationContext.getBean("adapter", ObjectAdapter.class);
        adapter.say();
    }
}