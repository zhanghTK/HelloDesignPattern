package tk.zhangh.pattern.structure.decorator;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/3/14.
 * 具体的装饰器B，扩展基本方法
 */
public class ConcreteDecoratorB extends Decorator{
    private Logger log = Logger.getLogger(this.getClass());
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        component.execute();
        log.info("add new function B");
    }
}
