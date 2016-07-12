package tk.zhangh.pattern.observer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangHao on 2016/7/12.
 */
@Component
@ComponentScan
public class ObserverConf {
    @Bean
    public Subject subject() {
        return new Subject();
    }

    @Bean
    public Observer1 observer1(Subject subject) {
        return new Observer1(subject);
    }

    @Bean Observer2 observer2(Subject subject) {
        return new Observer2(subject);
    }
}
