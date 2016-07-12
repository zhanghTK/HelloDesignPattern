package tk.zhangh.pattern.create.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例，静态内部类线程安全
 */
public class LazySingletonStatic {
    private static class SingletonHolder{
        private static final LazySingletonStatic INSTANCE = new LazySingletonStatic();
    }
//    使用静态初始化块的方式，饿汉
//    private LazySingletonSimple instance;
//    static {
//        instance = new LazySingletonSimple();
//    }

    private LazySingletonStatic(){}

    public static LazySingletonStatic getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
