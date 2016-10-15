package tk.zhangh.pattern.behavior.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhanghao on 16/3/10.
 * 策略A接口的具体实现
 * 实现方法A2
 */
public class StrategyA2 implements StrategyA{
    private static Logger logger = LoggerFactory.getLogger(StrategyA2.class);
    @Override
    public void executeStrategy() {
        logger.info("");
    }
}