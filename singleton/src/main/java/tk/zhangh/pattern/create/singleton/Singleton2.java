package tk.zhangh.pattern.create.singleton;

/**
 * 使用内部类的饿汉单例
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton2 {
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}
