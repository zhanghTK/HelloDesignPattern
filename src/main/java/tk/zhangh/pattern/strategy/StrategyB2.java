package tk.zhangh.pattern.strategy;

import org.apache.log4j.Logger;

/**
 * Created by zhanghao on 16/3/10.
 * 策略B接口的具体实现
 * 实现方法B2
 */
public class StrategyB2 implements StrategyB{
    private static Logger logger = Logger.getLogger(StrategyB1.class);
    @Override
    public void executeStrategy() {
        logger.info("");
    }
}