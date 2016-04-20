package tk.zhangh.pattern.state;

/**
 * 具体状态对象A
 * Created by ZhangHao on 2016/4/20.
 */
public class ConcreteStateA implements State{
    public void handle(String name) {
        System.out.println("Hello " + name);
    }
}
