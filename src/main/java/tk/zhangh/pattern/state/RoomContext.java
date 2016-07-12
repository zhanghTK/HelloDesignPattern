package tk.zhangh.pattern.state;

import org.apache.log4j.Logger;

/**
 * 房间（上下文）
 * Created by ZhangHao on 2016/4/20.
 */
public class RoomContext {
    private Logger logger = Logger.getLogger(RoomContext.class);
    private State state;

    public void setState(State state) {
        logger.info("state change");
        this.state = state;
        state.handle();
    }
}
