package tk.zhangh.pattern.structure.decorator;

/**
 * Created by ZhangHao on 2016/3/14.
 * 装饰模块接口，提供方法调用接口
 * 所有装饰角色，被装饰角色均继承此接口
 */
public interface Component {
    void execute();
}
