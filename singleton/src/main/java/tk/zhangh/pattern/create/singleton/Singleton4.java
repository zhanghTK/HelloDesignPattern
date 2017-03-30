package tk.zhangh.pattern.create.singleton;

/**
 * 懒汉单例
 * 加锁保证线程安全
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
