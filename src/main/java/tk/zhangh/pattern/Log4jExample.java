package tk.zhangh.pattern;


import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/6.
 */
public class Log4jExample {
//    static Logger log = Logger.getLogger(Log4jExample.class.getName());
//    static Logger log = Logger.getRootLogger();
    static Logger log = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
