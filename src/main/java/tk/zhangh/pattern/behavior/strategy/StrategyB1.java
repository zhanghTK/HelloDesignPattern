package tk.zhangh.pattern.behavior.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhanghao on 16/3/10.
 * 策略B接口的具体实现
 * 实现方法B1
 */
public class StrategyB1 implements StrategyB{
    private static Logger logger = LoggerFactory.getLogger(StrategyB1.class);
    @Override
    public void executeStrategy() {
        logger.info("");
    }
}