package tk.zhangh.pattern.create.builder;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
