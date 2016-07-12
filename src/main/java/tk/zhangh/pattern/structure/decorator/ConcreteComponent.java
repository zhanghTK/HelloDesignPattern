package tk.zhangh.pattern.structure.decorator;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/3/14.
 * 具体的被装饰对象，实现了装饰模块接口提供最基本的方法
 */
public class ConcreteComponent implements Component{
    private static Logger log = Logger.getLogger(ConcreteComponent.class);
    @Override
    public void execute() {
        log.info("base function");
    }
}
