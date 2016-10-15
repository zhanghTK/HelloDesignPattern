package tk.zhangh.pattern.behavior.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 房间（上下文）
 * Created by ZhangHao on 2016/4/20.
 */
public class RoomContext {
    private Logger logger = LoggerFactory.getLogger(RoomContext.class);
    private State state;

    public void setState(State state) {
        logger.info("state change");
        this.state = state;
        state.handle();
    }
}
