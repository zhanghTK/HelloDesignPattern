package tk.zhangh.pattern.behavior.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 入住状态
 * Created by ZhangHao on 2016/4/20.
 */
public class CheckedInState implements State{
    private static Logger logger = LoggerFactory.getLogger(CheckedInState.class);
    public void handle() {
        logger.info("checked in state");
    }
}
