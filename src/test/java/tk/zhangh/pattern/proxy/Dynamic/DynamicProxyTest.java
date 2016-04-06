package tk.zhangh.pattern.proxy.dynamic;

import org.junit.Test;
import tk.zhangh.pattern.proxy.RealSubject;
import tk.zhangh.pattern.proxy.Subject;

/**
 * JDK实现动态代理测试类
 * Created by ZhangHao on 2016/3/8.
 */
public class DynamicProxyTest {
    @Test
    public void testDynamicProxy(){
        Subject subjectProxy = new DynamicProxy(new RealSubject()).getProxy();
        subjectProxy.sayHello("hello world!");
        subjectProxy.syaBye("bye");
    }
}
