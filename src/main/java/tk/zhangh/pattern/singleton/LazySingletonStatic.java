package tk.zhangh.pattern.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例，线程安全
 */
public class LazySingletonStatic {
    private static class SingletonHolder{
        private static final LazySingletonStatic INSTANCE = new LazySingletonStatic();
    }
//    使用静态初始化块的方式
//    private LazySingleton instance;
//    static {
//        instance = new LazySingleton();
//    }

    private LazySingletonStatic(){}

    public static LazySingletonStatic getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
