package tk.zhangh.pattern.create.builder;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class AirShip {
    private OrbitalModule orbitalModule;  // 轨道舱
    private Engine engine;  // 发动机
    private EscapeTower escapeTower; // 逃逸塔

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
