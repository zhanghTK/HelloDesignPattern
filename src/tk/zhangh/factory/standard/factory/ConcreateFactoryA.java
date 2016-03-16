package tk.zhangh.factory.standard.factory;

import tk.zhangh.factory.standard.product.ConcreateProductA;
import tk.zhangh.factory.standard.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 具体工厂实现类A
 */
public class ConcreateFactoryA implements IFactory{
    @Override
    public IProduct create() {
        return new ConcreateProductA();
    }
}
