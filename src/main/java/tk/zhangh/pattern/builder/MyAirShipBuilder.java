package tk.zhangh.pattern.builder;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("myEngine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("myOrbitalModule");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("myEscapeTower");
    }
}
