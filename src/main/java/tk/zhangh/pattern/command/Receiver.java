package tk.zhangh.pattern.command;

import org.apache.log4j.Logger;

/**
 * 真正命令执行者，包含若干个命令
 * Created by ZhangHao on 2016/4/13.
 */
public class Receiver {
    private static Logger logger = Logger.getLogger(Receiver.class);

    public void open(){
        logger.info("open command");
    }

    public void close(){
        logger.info("close command");
    }
}
