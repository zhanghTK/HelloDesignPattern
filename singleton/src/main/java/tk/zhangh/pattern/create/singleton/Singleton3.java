package tk.zhangh.pattern.create.singleton;

/**
 * 简单懒汉单例
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
