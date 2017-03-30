package tk.zhangh.pattern.structure.proxy;


/**
 * 被代理角色
 * 实现基本的业务逻辑
 * Created by ZhangHao on 2016/3/8.
 */
public class RealSubject implements Subject {

    public void sayHello(String hello) {
        System.out.println(hello);
    }

    public void sayBye(String bye) {

        System.out.println(bye);

    }
}
