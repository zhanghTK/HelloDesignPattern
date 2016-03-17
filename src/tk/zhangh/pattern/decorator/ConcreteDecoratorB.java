package tk.zhangh.pattern.decorator;

/**
 * Created by ZhangHao on 2016/3/14.
 * 具体的装饰器B，扩展基本方法
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
        System.out.println("add function B");
    }

    @Override
    public void execute() {
        component.execute();
        System.out.println("execute new function B...");
    }
}
