package tk.zhangh.pattern.facade;

import org.junit.Test;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class FacadeTest {
    @Test
    public void testFacade() {
        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();
        serviceA.methodA();
        serviceB.methodB();

        Facade facade = new Facade(serviceA, serviceB);
        facade.funcAB();
    }
}