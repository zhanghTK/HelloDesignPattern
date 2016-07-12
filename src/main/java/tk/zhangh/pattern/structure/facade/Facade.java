package tk.zhangh.pattern.structure.facade;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;


    public Facade(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;

    }

    public void funcAB() {
        serviceA.methodA();
        serviceB.methodB();
    }
}
