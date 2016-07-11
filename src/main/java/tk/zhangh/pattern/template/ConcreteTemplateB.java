package tk.zhangh.pattern.template;


/**
 * 模板B
 * Created by ZhangHao on 2016/4/18.
 */
public class ConcreteTemplateB extends AbstractTemplate{
    @Override
    protected void abstractMethod() {
        logger.info("");
    }

    @Override
    protected void hookMethod() {
        logger.info("");
    }
}
