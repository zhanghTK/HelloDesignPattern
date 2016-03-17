package tk.zhangh.pattern.factory.standard.product;

/**
 * Created by ZhangHao on 2016/3/16.
 * 具体产品类A
 */
public class ConcreateProductA implements IProduct{
    @Override
    public void operation1() {
        System.out.println("operationA1");
    }

    @Override
    public void operation2() {
        System.out.println("operationA2");
    }
}
