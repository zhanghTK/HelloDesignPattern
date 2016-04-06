package tk.zhangh.pattern.proxy.simple;

import org.junit.Test;
import tk.zhangh.pattern.proxy.RealSubject;
import tk.zhangh.pattern.proxy.Subject;

/**
 * 测试静态代理类
 * Created by ZhangHao on 2016/3/8.
 */
public class SimpleProxyTest {
    @Test
    public void testSimpleProxySubject(){
        Subject proxy = new SimpleProxy(new RealSubject());
        proxy.sayHello("hello world");
    }
}