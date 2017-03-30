package tk.zhangh.pattern.structure.proxy;

/**
 * 简单静态代理
 * Created by ZhangHao on 17/3/30.
 */
public class SimpleProxy implements Subject {

    private Subject subject;

    public SimpleProxy(Subject subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
        SimpleProxy simpleProxy = new SimpleProxy(new RealSubject());
        simpleProxy.sayHello("hello");
        simpleProxy.sayBye("bye");
    }

    @Override
    public void sayHello(String hello) {
        System.out.println("SimpleProxy.sayHello()");
        subject.sayHello(hello);
    }

    @Override
    public void sayBye(String bye) {
        System.out.println("SimpleProxy.sayBye()");
        subject.sayBye(bye);
    }
}
