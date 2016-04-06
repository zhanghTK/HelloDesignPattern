package tk.zhangh.pattern.factory.standard.product;

/**
 * Created by ZhangHao on 2016/3/16.
 * 具体产品类B
 */
public class ConcreateProductB implements IProduct{
    @Override
    public void operation1() {
        System.out.println("operationB1");
    }

    @Override
    public void operation2() {
        System.out.println("operationB2");
    }
}
