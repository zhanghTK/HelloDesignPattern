package tk.zhangh.pattern.behavior.command;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 真正命令执行者，包含若干个命令
 * Created by ZhangHao on 2016/4/13.
 */
public class Receiver {
    private static Logger logger = LoggerFactory.getLogger(Receiver.class);

    public void open(){
        logger.info("open command");
    }

    public void close(){
        logger.info("close command");
    }
}
