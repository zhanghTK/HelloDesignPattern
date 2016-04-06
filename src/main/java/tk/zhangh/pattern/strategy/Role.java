package tk.zhangh.pattern.strategy;

/**
 * Created by zhanghao on 16/3/10.
 * 角色类
 * 包含方法A,B,C
 * 所有角色有相同的方法C,不同角色可能有不同的方法A,B
 */
public class Role {
    private StrategyA strategyA;  // 策略A
    private StrategyB strategyB;  // 策略B

    // 构造方法传入策略A,B
    public Role(StrategyA strategyA, StrategyB strategyB) {
        this.strategyA = strategyA;
        this.strategyB = strategyB;
    }

    /**
     * 设置策略A
     * @param strategyA 策略A
     */
    public void setStrategyA(StrategyA strategyA) {
        this.strategyA = strategyA;
    }

    /**
     * 设置策略B
     * @param strategyB 策略B
     */
    public void setStrategyB(StrategyB strategyB) {
        this.strategyB = strategyB;
    }

    /**
     * 执行方法A
     */
    public void doA(){
        strategyA.executeStrategy();
    }

    /**
     * 执行方法B
     */
    public void doB(){
        strategyB.executeStrategy();
    }

    /**
     * 执行方法C
     */
    public void doC(){
        System.out.println("Do C ...");
    }
}