package tk.zhangh.pattern.strategy;

/**
 * Created by zhanghao on 16/3/10.
 * 策略B接口的具体实现
 * 实现方法B1
 */
public class StrategyB1 implements StrategyB{
    @Override
    public void executeStrategy() {
        System.out.println("Do B1...");
    }
}