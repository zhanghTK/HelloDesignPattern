package tk.zhangh.pattern.proxy.Dynamic;

import org.junit.Test;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class DynamicProxyTest {
    @Test
    public void testDynamicProxy(){
        Subject proxy = DynProxyFactory.getInstance();
        proxy.dealTask("method");
    }
}
