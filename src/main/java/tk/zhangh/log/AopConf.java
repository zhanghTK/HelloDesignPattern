package tk.zhangh.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 日志切面配置
 * Created by ZhangHao on 2016/7/12.
 */
@ComponentScan
@EnableAspectJAutoProxy
public class AopConf {
    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
