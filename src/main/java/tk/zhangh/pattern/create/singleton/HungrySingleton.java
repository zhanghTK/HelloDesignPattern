package tk.zhangh.pattern.create.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 饿汉单例
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
