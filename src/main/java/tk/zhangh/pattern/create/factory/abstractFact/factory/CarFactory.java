package tk.zhangh.pattern.create.factory.abstractFact.factory;

import tk.zhangh.pattern.create.factory.abstractFact.product.engine.Engine;
import tk.zhangh.pattern.create.factory.abstractFact.product.seat.Seat;
import tk.zhangh.pattern.create.factory.abstractFact.product.tyre.Tyre;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();

}
