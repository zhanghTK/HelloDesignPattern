package tk.zhangh.pattern.behavior.command;

import org.springframework.context.annotation.Bean;

/**
 * 命令模式测试配置
 * Created by ZhangHao on 17/1/15.
 */
public class CommandTestConfig {
    @Bean
    public Light light() {
        return new Light();
    }

    @Bean
    public Tv tv() {
        return new Tv();
    }

    @Bean
    public Command openLight() {
        return new LightUp(light());
    }

    @Bean
    public Command closeLight() {
        return new LightDown(light());
    }

    @Bean
    public Command tvUp() {
        return new TvUp(tv());
    }

    @Bean
    public Command tvDown() {
        return new TvDown(tv());
    }

    @Bean
    public Invoke lightInvoke() {
        return new Invoke(openLight(), closeLight());
    }

    @Bean
    public Invoke tvInvoke() {
        return new Invoke(tvUp(), tvDown());
    }
}
