package tk.zhangh.pattern.behavior.template;


/**
 * 具体实现B
 * Created by ZhangHao on 17/3/30.
 */
public class ConcreteB extends AbstractTemplate {
    @Override
    protected void first() {
        System.out.println("in Concrete B first");
        hookMethod();
    }
}
