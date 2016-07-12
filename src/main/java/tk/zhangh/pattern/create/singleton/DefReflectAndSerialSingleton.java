package tk.zhangh.pattern.create.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by ZhangHao on 2016/6/30.
 * 防止序列化和反射破坏单例，使用加锁懒汉单例模式
 */
public class DefReflectAndSerialSingleton implements Serializable {
    private static DefReflectAndSerialSingleton instance;

    /**
     * 防止反射创建多个单例
     */
    private DefReflectAndSerialSingleton(){
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    /**
     * 防止序列化创建多个单例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    public static synchronized DefReflectAndSerialSingleton getInstance(){
        if (instance == null){
            instance = new DefReflectAndSerialSingleton();
        }
        return instance;
    }
}
