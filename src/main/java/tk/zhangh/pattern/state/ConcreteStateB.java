package tk.zhangh.pattern.state;

/**
 * 具体状态对象B
 * Created by ZhangHao on 2016/4/20.
 */
public class ConcreteStateB implements State{
    public void handle(String name) {
        System.out.println("Bye " + name);
    }
}
