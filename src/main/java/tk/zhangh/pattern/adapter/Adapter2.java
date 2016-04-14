package tk.zhangh.pattern.adapter;

/**
 * 适配器类，使用对象的适配器模式
 * Created by ZhangHao on 2016/4/14.
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void say() {
        adaptee.sayHello();
    }
}
