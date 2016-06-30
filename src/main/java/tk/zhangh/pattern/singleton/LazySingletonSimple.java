package tk.zhangh.pattern.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例，非线程安全
 */
public class LazySingletonSimple {
    private static LazySingletonSimple instance;

    private LazySingletonSimple(){}

    public static LazySingletonSimple getInstance(){
        if (instance == null){
            instance = new LazySingletonSimple();
        }
        return instance;
    }
}
