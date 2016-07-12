package tk.zhangh.pattern.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 * Created by ZhangHao on 2016/4/6.
 */
public class CGLibProxy implements MethodInterceptor {
    private volatile static CGLibProxy instance;
    private CGLibProxy(){}

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls, this);
    }

    public static CGLibProxy getInstance(){
        if (instance == null){
            synchronized (CGLibProxy.class){
                if (instance == null){
                    instance = new CGLibProxy();
                }
            }
        }
        return instance;
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");
        long start = System.currentTimeMillis();  // AOP
        Object result = methodProxy.invokeSuper(object, args);
        long end = System.currentTimeMillis();
        System.out.println("consuming " + (end - start) + "ms");  // AOP
        System.out.println("end...");
        return result;
    }
}
