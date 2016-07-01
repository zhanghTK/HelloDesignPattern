package tk.zhangh.pattern.adapter;

/**
 * 适配器类，使用类的适配器模式
 * Created by ZhangHao on 2016/4/14.
 */
public class ClassAdapter extends Adaptee implements Target{
    /**
     * 方法名为say，调用sayHello方法
     */
    public void say() {
        super.sayHello();
    }
}
