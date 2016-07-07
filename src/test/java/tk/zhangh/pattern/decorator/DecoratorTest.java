package tk.zhangh.pattern.decorator;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by ZhangHao on 2016/3/14.
 * 装饰器模式测试方法
 */
public class DecoratorTest {
    private Logger logger = Logger.getLogger(DecoratorTest.class);
    @Test
    public void testDecorator(){
        Component component = new ConcreteComponent();  // 基本的被装饰对象
        component.execute();
        logger.info("");
        component = new ConcreteDecoratorA(component);  // 添加装饰器A
        component.execute();
        logger.info("");
        component = new ConcreteDecoratorB(component);  // 添加装饰器B
        component.execute();
    }

}