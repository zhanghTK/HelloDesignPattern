package tk.zhangh.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZhangHao on 2016/4/6.
 */
public class CGLibProxy implements MethodInterceptor {
    private volatile static CGLibProxy instance;
    private CGLibProxy(){}

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

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(object, args);
        after();
        return result;
    }

    public void before(){

    }

    public void after(){

    }
}
