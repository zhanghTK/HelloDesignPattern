package tk.zhangh.pattern.behavior.chain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 责任链模式配置信息，配置组装相关Bean
 * Created by ZhangHao on 2016/8/3.
 */
@Configuration
@ComponentScan
public class ChainConf {
    @Bean
    public Director director() {
        Director director = new Director("Director");
        director.setNextLeader(manager());
        return director;
    }

    @Bean
    public Manager manager() {
        Manager manager = new Manager("Manager");
        manager.setNextLeader(generalManager());
        return manager;
    }

    @Bean
    public GeneralManager generalManager() {
        GeneralManager generalManager = new GeneralManager("GeneralManager");
        generalManager.setNextLeader(null);
        return generalManager;
    }

    @Bean
    public LeaveRequest leaveRequest () {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setEmpName("Tom");
        leaveRequest.setLeaveReason("探亲");
        return new LeaveRequest();
    }
}
