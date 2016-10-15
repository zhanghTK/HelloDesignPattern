package tk.zhangh.pattern.structure.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ConcreteFlyweight implements Flyweight{
    private static Logger logger = LoggerFactory.getLogger(ConcreteFlyweight.class);
    private Character intrinsicState;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        logger.info(String.format("Intrinsic state:%s, Extrinsic state:%s", intrinsicState, state));
    }
}
