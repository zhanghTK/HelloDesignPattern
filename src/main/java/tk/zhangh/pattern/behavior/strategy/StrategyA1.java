package tk.zhangh.pattern.behavior.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhanghao on 16/3/10.
 * 策略A接口的具体实现
 * 实现方法A1
 */
public class StrategyA1 implements StrategyA{
    private static Logger logger = LoggerFactory.getLogger(StrategyA1.class);
    @Override
    public void executeStrategy() {
        logger.info("");
    }
}