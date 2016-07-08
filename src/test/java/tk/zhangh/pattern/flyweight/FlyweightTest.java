package tk.zhangh.pattern.flyweight;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class FlyweightTest {
    private static Logger logger = Logger.getLogger(FlyweightTest.class);
    @Test
    public void testFlyweight() {
        logger.info("简单享元");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyWeight1 = factory.getFlyWeight(new Character('a'));
        Flyweight flyWeight2 = factory.getFlyWeight(new Character('a'));
        Assert.assertEquals(flyWeight1,flyWeight2);

        logger.info("复合享元");
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.getFlyWeight(compositeState);
        Flyweight compositeFly2 = flyFactory.getFlyWeight(compositeState);
        Assert.assertNotSame(compositeFly1, compositeFly2);
    }
}