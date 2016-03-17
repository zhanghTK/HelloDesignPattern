package tk.zhangh.pattern.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例，非线程安全
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
