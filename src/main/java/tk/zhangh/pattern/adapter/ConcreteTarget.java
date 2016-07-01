package tk.zhangh.pattern.adapter;

/**
 * 标准接口的一个具体实现类
 * Created by ZhangHao on 2016/4/14.
 */
public class ConcreteTarget implements Target{
    public void say() {
        System.out.println("say function");
    }
}
