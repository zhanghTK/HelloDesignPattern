package tk.zhangh.pattern.proxy.Dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class DynProxyFactory {
    public static Subject getInstance(){
        Subject realSubject = new RealSubject();  // 被代理对象
        // 代理对象,此对象是在运行时动态生成的对象
        Subject proxy = (Subject) Proxy.newProxyInstance(
                // ClassLoader对象，定义由哪个ClassLoader对象来对生成的代理对象加载
                realSubject.getClass().getClassLoader(),
                // 一个Interface对象的数组，表示被代理的对象需要实现哪些接口
                realSubject.getClass().getInterfaces(),
                // 一个InvocationHandler对象，表示动态代理对象在调用方法时关联到哪个InvocationHandler对象
                new SubjectInvocationHandler(realSubject));
        return proxy;
    }
}
