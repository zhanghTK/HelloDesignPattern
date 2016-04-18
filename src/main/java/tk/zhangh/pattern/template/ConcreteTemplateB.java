package tk.zhangh.pattern.template;

/**
 * 模板B
 * Created by ZhangHao on 2016/4/18.
 */
public class ConcreteTemplateB extends AbstractTemplate{
    @Override
    protected void abstractMethod() {
        System.out.println("ConcreteTemplateB.abstractMethod()");
    }

    @Override
    protected void hookMethod() {
        System.out.println("ConcreteTemplateB.hookMethod()");
    }
}
