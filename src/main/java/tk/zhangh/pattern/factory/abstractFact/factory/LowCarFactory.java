package tk.zhangh.pattern.factory.abstractFact.factory;

import tk.zhangh.pattern.factory.abstractFact.product.engine.Engine;
import tk.zhangh.pattern.factory.abstractFact.product.engine.LowEngine;
import tk.zhangh.pattern.factory.abstractFact.product.seat.LowSeat;
import tk.zhangh.pattern.factory.abstractFact.product.seat.Seat;
import tk.zhangh.pattern.factory.abstractFact.product.tyre.LowTyre;
import tk.zhangh.pattern.factory.abstractFact.product.tyre.Tyre;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
