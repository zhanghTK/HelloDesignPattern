package tk.zhangh.pattern.strategy;

/**
 * Created by zhanghao on 16/3/10.
 * 策略A接口的具体实现
 * 实现方法A1
 */
public class StrategyA1 implements StrategyA{
    @Override
    public void executeStrategy() {
        System.out.println("Do A1...");
    }
}