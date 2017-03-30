package tk.zhangh.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * Created by ZhangHao on 17/3/30.
 */
public class DynamicProxy implements InvocationHandler {

    private Object delegate;

    public DynamicProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static void main(String[] args) {
        Subject subjectProxy = new DynamicProxy(new RealSubject()).getProxy();
        subjectProxy.sayHello("hello");
        subjectProxy.sayBye("bye");
    }

    @SuppressWarnings(value = "unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("DynamicProxy invoke()");
        return method.invoke(delegate, args);
    }
}
