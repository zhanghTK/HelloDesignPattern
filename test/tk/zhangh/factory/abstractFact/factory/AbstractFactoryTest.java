package tk.zhangh.factory.abstractFact.factory;

import org.junit.Test;
import tk.zhangh.factory.abstractFact.product.IProduct1;
import tk.zhangh.factory.abstractFact.product.IProduct2;

/**
 * Created by ZhangHao on 2016/3/16.
 * 抽象工厂测试类
 */
public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory(){
        IFactort factortA = new FactoryA();
        IProduct1 product1 = factortA.createProduct1();
        IProduct2 product2 = factortA.createProduct2();
        System.out.println("Factory A:");
        product1.operationOne();
        product2.operationTwo();

        IFactort factortB = new FactoryB();
        product1 = factortB.createProduct1();
        product2 = factortB.createProduct2();
        System.out.println("Factory A:");
        product1.operationOne();
        product2.operationTwo();
    }
}