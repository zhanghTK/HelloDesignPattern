package tk.zhangh.pattern.behavior.observer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.zhangh.pattern.behavior.observer.Observer1;
import tk.zhangh.pattern.behavior.observer.Observer2;
import tk.zhangh.pattern.behavior.observer.Subject;

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

    @Bean
    Observer2 observer2(Subject subject) {
        return new Observer2(subject);
    }
}
