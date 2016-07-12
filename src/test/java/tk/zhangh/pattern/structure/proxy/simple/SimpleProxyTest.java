package tk.zhangh.pattern.structure.proxy.simple;

import org.junit.Test;
import tk.zhangh.pattern.structure.proxy.RealSubject;
import tk.zhangh.pattern.structure.proxy.Subject;
import tk.zhangh.pattern.structure.proxy.simple.SimpleProxy;

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