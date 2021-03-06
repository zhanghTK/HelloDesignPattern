package tk.zhangh.pattern.create.factory.standard.factory;

import tk.zhangh.pattern.create.factory.standard.product.ConcreateProductB;
import tk.zhangh.pattern.create.factory.standard.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 具体工厂实现类B
 */
public class ConcreateFactoryB implements IFactory{
    @Override
    public IProduct create() {
        return new ConcreateProductB();
    }
}
