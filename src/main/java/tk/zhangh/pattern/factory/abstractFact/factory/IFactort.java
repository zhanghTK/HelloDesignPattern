package tk.zhangh.pattern.factory.abstractFact.factory;

import tk.zhangh.pattern.factory.abstractFact.product.IProduct1;
import tk.zhangh.pattern.factory.abstractFact.product.IProduct2;

/**
 * Created by ZhangHao on 2016/3/16.
 * 工厂接口声明，有产品线1，产品线2
 */
public interface IFactort {
    IProduct1 createProduct1();
    IProduct2 createProduct2();
}
