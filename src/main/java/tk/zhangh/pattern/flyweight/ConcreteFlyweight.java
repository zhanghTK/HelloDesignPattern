package tk.zhangh.pattern.flyweight;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ConcreteFlyweight implements Flyweight{
    private static Logger logger = Logger.getLogger(ConcreteFlyweight.class);
    private Character intrinsicState;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        logger.info(String.format("Intrinsic state:%s, Extrinsic state:%s", intrinsicState, state));
    }
}
