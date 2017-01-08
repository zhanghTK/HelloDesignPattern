package tk.zhangh.pattern.behavior.chain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 装配责任链模式
 * Created by ZhangHao on 17/1/3.
 */
@Configuration
public class ChainTestConfig {
    @Bean
    public Leader1 leader1() {
        return new Leader1("leader1", leader2());
    }

    @Bean
    public Leader2 leader2() {
        return new Leader2("leader2", leader3());
    }

    @Bean
    public Leader3 leader3() {
        return new Leader3("leader3", null);
    }

    @Bean
    public LeaveRequest request2Days() {
        return new LeaveRequest("person1", 2, "探亲");
    }

    @Bean
    public LeaveRequest request9Days() {
        return new LeaveRequest("person2", 9, "探亲");
    }

    @Bean
    public LeaveRequest request15Days() {
        return new LeaveRequest("person3", 15, "探亲");
    }

    @Bean
    public LeaveRequest request35Days() {
        return new LeaveRequest("person4", 35, "探亲");
    }
}
