package tk.zhangh.pattern.structure.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/3/14.、
 * 具体的装饰器A，扩展基本方法
 */
public class ConcreteDecoratorA extends Decorator{
    private static Logger log = LoggerFactory.getLogger(ConcreteDecoratorA.class);
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        component.execute();
        log.info("add new function A");
    }
}
