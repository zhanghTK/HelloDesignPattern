package tk.zhangh.factory.standard.factory;

import org.junit.Test;
import tk.zhangh.factory.standard.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 标准工厂测试
 */
public class StandardFactoryTest {
    @Test
    public void testStandardFactory(){
        IProduct product = new ConcreateFactoryA().create();
        product.operation1();
        product = new ConcreateFactoryB().create();
        product.operation1();
    }
}