package tk.zhangh.pattern.proxy.simple;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class ProxySubject implements Subject{
    // 实际被代理对象
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void dealTask(String taskName) {
        long start = System.currentTimeMillis();  // AOP
        realSubject.dealTask(taskName);  // 执行被代理对象的方法
        long end = System.currentTimeMillis();  // AOP
        System.out.println("consuming " + (end - start) + "ms");
    }
}
