package tk.zhangh.factory.abstractFact.factory;

import tk.zhangh.factory.abstractFact.product.*;

/**
 * Created by ZhangHao on 2016/3/16.
 * 工厂实现类B，生产产品1B，产品2B
 */
public class FactoryB implements IFactort{
    @Override
    public IProduct1 createProduct1() {
        return new Product1B();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2B();
    }
}
