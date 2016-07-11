package tk.zhangh.pattern.template;

/**
 * 模板A
 * Created by ZhangHao on 2016/4/18.
 */
public class ConcreteTemplateA extends AbstractTemplate{
    @Override
    protected void abstractMethod() {
        logger.info("");
    }

    @Override
    protected void hookMethod() {
        logger.info("");
    }
}
