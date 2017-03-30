package tk.zhangh.pattern.create.singleton;

/**
 * 双锁懒汉单例
 * Created by ZhangHao on 17/3/30.
 */
public class Singleton6 {
    private volatile static Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
