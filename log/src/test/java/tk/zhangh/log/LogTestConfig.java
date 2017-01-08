package tk.zhangh.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.zhangh.pattern.BusinessService;

/**
 * 日志测试配置文件
 * Created by ZhangHao on 17/1/3.
 */
@Configuration
public class LogTestConfig {
    @Bean
    public BusinessService businessService() {
        return new BusinessService();
    }
}
