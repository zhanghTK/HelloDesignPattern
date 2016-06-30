package tk.zhangh.pattern.factory.abstractFact;

import org.junit.Test;
import tk.zhangh.pattern.factory.abstractFact.factory.CarFactory;
import tk.zhangh.pattern.factory.abstractFact.factory.LowCarFactory;
import tk.zhangh.pattern.factory.abstractFact.factory.LuxuryCarFactory;

/**
 * Created by ZhangHao on 2016/3/16.
 * 抽象工厂测试类
 */
public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        CarFactory carFactory;
        carFactory = new LuxuryCarFactory();
        createCar(carFactory);
        carFactory = new LowCarFactory();
        createCar(carFactory);
    }

    public void createCar(CarFactory carFactory) {
        carFactory.createEngine().run();
        carFactory.createSeat().massage();
        carFactory.createTyre().revolve();
    }
}