package tk.zhangh.pattern.proxy.cglib;

import org.junit.Test;
import tk.zhangh.pattern.proxy.RealSubject;
import tk.zhangh.pattern.proxy.Subject;

/**
 * cglib动态代理测试类
 * Created by ZhangHao on 2016/4/6.
 */
public class CGLibProxyTest {
    @Test
    public void testCglib(){
        Subject subjectProxy = CGLibProxy.getInstance().getProxy(RealSubject.class);
        subjectProxy.sayHello("hello world");
        subjectProxy.syaBye("Bye");
    }
}