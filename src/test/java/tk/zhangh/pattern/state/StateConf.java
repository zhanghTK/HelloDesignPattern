package tk.zhangh.pattern.state;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZhangHao on 2016/7/12.
 */
@Configuration
@ComponentScan
public class StateConf {
    @Bean
    public RoomContext context() {
        return new RoomContext();
    }

    @Bean
    public FreeState freeState() {
        return new FreeState();
    }

    @Bean
    public BookedState bookedState() {
        return new BookedState();
    }

    @Bean
    public CheckedInState checkedInState() {
        return new CheckedInState();
    }
}
