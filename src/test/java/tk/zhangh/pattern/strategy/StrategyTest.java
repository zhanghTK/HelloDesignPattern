package tk.zhangh.pattern.strategy;

import org.junit.Test;


/**
 * Created by zhanghao on 16/3/10.
 * 策略模式测试类
 */
public class StrategyTest {
    @Test
    public void testStrategy(){
        // 策略A
        StrategyA strategyA1 = new StrategyA1();
        StrategyA strategyA2 = new StrategyA2();
        // 策略B
        StrategyB strategyB1 = new StrategyB1();
        StrategyB strategyB2 = new StrategyB2();

        // 由策略A,B构建角色
        Role role1 = new Role(strategyA1, strategyB1);
        Role role2 = new Role(strategyA1, strategyB2);
        Role role3 = new Role(strategyA2, strategyB1);
        Role role4 = new Role(strategyA2, strategyB2);

        Role[] roles = {role1, role2, role3, role4};
        // 每个角色分别执行方法A,B,C方法
        for (Role role : roles) {
            role.doA();
            role.doB();
            role.doC();
            System.out.println();
        }
    }
}