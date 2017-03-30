package tk.zhangh.pattern.create.singleton;

/**
 * 饿汉单例
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
