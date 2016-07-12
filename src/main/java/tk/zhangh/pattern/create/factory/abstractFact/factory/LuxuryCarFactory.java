package tk.zhangh.pattern.create.factory.abstractFact.factory;

import tk.zhangh.pattern.create.factory.abstractFact.product.engine.Engine;
import tk.zhangh.pattern.create.factory.abstractFact.product.engine.LuxuryEngine;
import tk.zhangh.pattern.create.factory.abstractFact.product.seat.LuxurySeat;
import tk.zhangh.pattern.create.factory.abstractFact.product.seat.Seat;
import tk.zhangh.pattern.create.factory.abstractFact.product.tyre.LuxuryTyre;
import tk.zhangh.pattern.create.factory.abstractFact.product.tyre.Tyre;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
