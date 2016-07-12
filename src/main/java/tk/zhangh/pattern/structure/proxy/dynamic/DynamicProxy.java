package tk.zhangh.pattern.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK实现的静态代理
 * Created by ZhangHao on 2016/3/8.
 */
public class DynamicProxy implements InvocationHandler{

    // 被代理的真实对象
    private Object delegate;

    // 初始化被代理的真实对象
    public DynamicProxy(Object delegate) {
        this.delegate = delegate;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(
                // ClassLoader对象，定义由哪个ClassLoader对象来对生成的代理对象加载
                delegate.getClass().getClassLoader(),
                // 一个Interface对象的数组，表示被代理的对象需要实现哪些接口
                delegate.getClass().getInterfaces(),
                // 一个InvocationHandler对象，表示动态代理对象在调用方法时关联到哪个InvocationHandler对象
                this
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        long start = System.currentTimeMillis();  // AOP
        // 反射调用被代理对象的方法
        Object result = method.invoke(delegate, args);
        long end = System.currentTimeMillis();
        System.out.println("consuming " + (end - start) + "ms");  // AOP
        System.out.println("end...");
        return result;
    }
}
