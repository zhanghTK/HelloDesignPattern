package tk.zhangh.pattern.create.bulider;

import org.junit.Assert;
import org.junit.Test;
import tk.zhangh.pattern.create.builder.AirShip;
import tk.zhangh.pattern.create.builder.AirShipDirector;
import tk.zhangh.pattern.create.builder.MyAirShipBuilder;
import tk.zhangh.pattern.create.builder.MyAirShipDirector;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class BuilderTest {
    @Test
    public void testBuilder(){
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip airShip = director.createAirShip();
        Assert.assertNotNull(airShip.getEngine());
        Assert.assertNotNull(airShip.getEscapeTower());
        Assert.assertNotNull(airShip.getOrbitalModule());
    }
}
