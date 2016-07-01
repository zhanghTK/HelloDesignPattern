package tk.zhangh.pattern.adapter;

/**
 * 适配器类，使用对象的适配器模式
 * Created by ZhangHao on 2016/4/14.
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 方法名为say，调用sayHello方法
     */
    public void say() {
        adaptee.sayHello();
    }
}
