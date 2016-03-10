package tk.zhangh.pattern.proxy.simple;

import org.junit.Test;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class SimpleProxyTest {
    @Test
    public void testSimpleProxySubject(){
        Subject proxy = SimpleProxyFactory.getInstance();
        proxy.dealTask("");
    }
}