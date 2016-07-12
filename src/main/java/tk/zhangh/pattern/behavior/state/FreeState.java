package tk.zhangh.pattern.behavior.state;

import org.apache.log4j.Logger;

/**
 * 空闲状态
 * Created by ZhangHao on 2016/4/20.
 */
public class FreeState implements State{
    private static Logger logger = Logger.getLogger(FreeState.class);
    public void handle() {
        logger.info("free state");
    }
}
