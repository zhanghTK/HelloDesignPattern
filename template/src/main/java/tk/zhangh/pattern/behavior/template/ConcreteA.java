package tk.zhangh.pattern.behavior.template;


/**
 * 具体实现A
 * Created by ZhangHao on 17/3/30.
 */
public class ConcreteA extends AbstractTemplate {
    @Override
    protected void first() {
        System.out.println("in Concrete A first");
        hookMethod();
    }
}
