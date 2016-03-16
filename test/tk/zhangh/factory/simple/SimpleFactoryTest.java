package tk.zhangh.factory.simple;

import org.junit.Test;
import tk.zhangh.factory.simple.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 简单工厂测试
 */
public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory(){
        IProduct product = SimpleFactory.create("A");
        product.operation1();
        product = SimpleFactory.create("B");
        product.operation1();
    }
}