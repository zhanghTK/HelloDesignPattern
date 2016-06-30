package tk.zhangh.pattern.factory.simple;

import tk.zhangh.pattern.factory.simple.product.ConcreateProductA;
import tk.zhangh.pattern.factory.simple.product.ConcreateProductB;
import tk.zhangh.pattern.factory.simple.product.IProduct;

/**
 * Created by ZhangHao on 2016/3/16.
 * 简单工厂类（静态工厂）
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

    public static IProduct createA() {
        return new ConcreateProductA();
    }

    public static IProduct createB() {
        return new ConcreateProductB();
    }
}
