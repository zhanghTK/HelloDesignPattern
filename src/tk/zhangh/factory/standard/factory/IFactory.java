package tk.zhangh.factory.standard.factory;

import tk.zhangh.factory.standard.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 工厂接口声明
 */
public interface IFactory {
    IProduct create();
}
