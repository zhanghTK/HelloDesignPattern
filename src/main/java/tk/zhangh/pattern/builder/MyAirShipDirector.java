package tk.zhangh.pattern.builder;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class MyAirShipDirector implements  AirShipDirector{
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip createAirShip() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
