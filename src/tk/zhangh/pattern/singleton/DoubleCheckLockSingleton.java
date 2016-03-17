package tk.zhangh.pattern.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例，双重校验锁
 */
public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton instance;
    private DoubleCheckLockSingleton(){}

    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
