package tk.zhangh.pattern.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB 动态代理
 * Created by ZhangHao on 17/3/30.
 */
public class CglibProxy implements MethodInterceptor {
    private volatile static CglibProxy instance;

    private CglibProxy() {
    }

    public static CglibProxy getInstance() {
        if (instance == null) {
            synchronized (CglibProxy.class) {
                if (instance == null) {
                    instance = new CglibProxy();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Subject subjectProxy = CglibProxy.getInstance().getProxy(RealSubject.class);
        subjectProxy.sayHello("hello");
        subjectProxy.sayBye("bye");
    }

    @SuppressWarnings(value = "unchecked")
    public <T> T getProxy(Class<T> clazz) {
        return ((T) Enhancer.create(clazz, this));
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("in CglibProxy intercept()");
        return methodProxy.invokeSuper(o, objects);
    }
}
