package tk.zhangh.pattern.structure.proxy.cglib;

import org.junit.Test;
import tk.zhangh.pattern.structure.proxy.RealSubject;
import tk.zhangh.pattern.structure.proxy.Subject;
import tk.zhangh.pattern.structure.proxy.cglib.CGLibProxy;

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