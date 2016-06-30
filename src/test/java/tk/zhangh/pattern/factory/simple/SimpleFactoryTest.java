package tk.zhangh.pattern.factory.simple;

import org.junit.Assert;
import org.junit.Test;
import tk.zhangh.pattern.factory.simple.product.ConcreateProductA;
import tk.zhangh.pattern.factory.simple.product.ConcreateProductB;
import tk.zhangh.pattern.factory.simple.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 简单工厂测试
 */
public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory(){
        IProduct product;
        product = SimpleFactory.create("A");
        Assert.assertTrue(product instanceof ConcreateProductA);
        product = SimpleFactory.create("B");
        Assert.assertTrue(product instanceof ConcreateProductB);

        product = SimpleFactory.createA();
        Assert.assertTrue(product instanceof ConcreateProductA);
        product = SimpleFactory.createB();
        Assert.assertTrue(product instanceof ConcreateProductB);
    }
}