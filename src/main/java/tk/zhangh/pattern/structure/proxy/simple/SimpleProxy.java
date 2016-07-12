package tk.zhangh.pattern.structure.proxy.simple;

import tk.zhangh.pattern.structure.proxy.Subject;

/**
 * 静态代理类
 * Created by ZhangHao on 2016/3/8.
 */
public class SimpleProxy implements Subject {
    // 实际被代理对象
    private Subject realSubject;

    public SimpleProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    public void sayHello(String hello) {
        System.out.println("before...");
        long start = System.currentTimeMillis();
        realSubject.sayHello(hello);  // 执行被代理对象的方法
        long end = System.currentTimeMillis();
        System.out.println("consuming " + (end - start) + "ms");
        System.out.println("end...");
    }

    public void syaBye(String bye) {
        System.out.println("before...");
        long start = System.currentTimeMillis();
        realSubject.sayHello(bye);  // 执行被代理对象的方法
        long end = System.currentTimeMillis();
        System.out.println("consuming " + (end - start) + "ms");
        System.out.println("end...");
    }
}
