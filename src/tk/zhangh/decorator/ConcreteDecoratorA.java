package tk.zhangh.decorator;

/**
 * Created by ZhangHao on 2016/3/14.、
 * 具体的装饰器A，扩展基本方法
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
        System.out.println("add function A");
    }

    @Override
    public void execute() {
        component.execute();
        System.out.println("execute new function A...");
    }
}
