package tk.zhangh.decorator;

/**
 * Created by ZhangHao on 2016/3/14.
 * 具体的被装饰对象，实现了装饰模块接口提供最基本的方法
 */
public class ConcreteComponent implements Component{
    @Override
    public void execute() {
        System.out.println("execute basic function");
    }
}
