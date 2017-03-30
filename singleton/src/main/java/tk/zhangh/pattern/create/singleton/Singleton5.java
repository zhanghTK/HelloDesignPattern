package tk.zhangh.pattern.create.singleton;

/**
 * 懒汉单例
 * 防止序列化和反射破坏,多线程安全
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
        if (instance != null) {
            throw new RuntimeException("");
        }
    }

    private static synchronized Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }
}
