package tk.zhangh.factory.abstractFact.factory;

import tk.zhangh.factory.abstractFact.product.IProduct1;
import tk.zhangh.factory.abstractFact.product.IProduct2;
import tk.zhangh.factory.abstractFact.product.Product1A;
import tk.zhangh.factory.abstractFact.product.Product2A;

/**
 * Created by ZhangHao on 2016/3/16.
 * 工厂实现类A，生产产品1A，产品2A
 */
public class FactoryA implements IFactort{
    @Override
    public IProduct1 createProduct1() {
        return new Product1A();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2A();
    }
}
