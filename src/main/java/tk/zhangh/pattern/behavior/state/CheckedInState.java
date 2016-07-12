package tk.zhangh.pattern.behavior.state;

import org.apache.log4j.Logger;

/**
 * 入住状态
 * Created by ZhangHao on 2016/4/20.
 */
public class CheckedInState implements State{
    private static Logger logger = Logger.getLogger(CheckedInState.class);
    public void handle() {
        logger.info("checked in state");
    }
}
