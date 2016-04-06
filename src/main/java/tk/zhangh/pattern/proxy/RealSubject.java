package tk.zhangh.pattern.proxy;


/**
 * 被代理角色
 * 实现基本的业务逻辑
 * Created by ZhangHao on 2016/3/8.
 */
public class RealSubject implements Subject {

    public void sayHello(String hello) {
        try {
            System.out.println(hello);
            Thread.sleep(3000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void syaBye(String bye) {
        try {
            System.out.println(bye);
            Thread.sleep(3000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
