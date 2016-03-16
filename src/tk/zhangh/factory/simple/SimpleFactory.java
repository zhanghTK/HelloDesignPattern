package tk.zhangh.factory.simple;

import tk.zhangh.factory.simple.product.ConcreateProductA;
import tk.zhangh.factory.simple.product.ConcreateProductB;
import tk.zhangh.factory.simple.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 简单工厂类
 */
public class SimpleFactory {
    public static IProduct create(String type){
        IProduct product;
        if ("A".equals(type)){
            product = new ConcreateProductA();
        }else if ("B".equals(type)){
            product = new ConcreateProductB();
        }else{
            product = null;
        }
        return product;
    }
}
