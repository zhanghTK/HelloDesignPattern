package tk.zhangh.pattern.memento;

import org.springframework.context.annotation.Bean;

/**
 * 备忘录配置
 * Created by ZhangHao on 17/2/26.
 */
public class MementoConfig {
    @Bean
    PositionCaretaker positionCaretaker() {
        return new PositionCaretaker();
    }
}
