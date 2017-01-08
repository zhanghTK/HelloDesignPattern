package tk.zhangh.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 切面配置
 * Created by ZhangHao on 17/1/3.
 */
@EnableAspectJAutoProxy
public class AopConf {
    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
