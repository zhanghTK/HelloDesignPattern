package tk.zhangh.pattern.behavior.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 空闲状态
 * Created by ZhangHao on 2016/4/20.
 */
public class FreeState implements State{
    private static Logger logger = LoggerFactory.getLogger(FreeState.class);
    public void handle() {
        logger.info("free state");
    }
}
