package tk.zhangh.pattern.state;

import org.apache.log4j.Logger;

/**
 * 预订状态
 * Created by ZhangHao on 2016/4/20.
 */
public class BookedState implements State{
    private static Logger logger = Logger.getLogger(FreeState.class);
    public void handle() {
        logger.info("booked state");
    }
}
