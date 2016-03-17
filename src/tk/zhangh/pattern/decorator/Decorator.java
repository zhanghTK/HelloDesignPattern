package tk.zhangh.pattern.decorator;

/**
 * Created by ZhangHao on 2016/3/14.
 * 抽象装饰器类，实现装饰模块接口
 * 有一个装饰模块对象的引用
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public abstract void execute();
}
