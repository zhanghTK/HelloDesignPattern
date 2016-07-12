package tk.zhangh.pattern.memento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZhangHao on 2016/7/12.
 */
@Configuration
@ComponentScan
public class MementoConf {
    @Bean
    public Emp emp() {
        return new Emp("name1", 2, 1000);
    }

    @Bean
    public CareTaker careTaker() {
        return new CareTaker();
    }

    @Bean
    public EmpMemento empMemento(Emp emp) {
        return new EmpMemento(emp);
    }
}
