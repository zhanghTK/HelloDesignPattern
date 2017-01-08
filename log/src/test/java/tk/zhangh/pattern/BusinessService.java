package tk.zhangh.pattern;

import org.springframework.stereotype.Component;

/**
 * 日志测试使用Service
 * Created by ZhangHao on 17/1/3.
 */
@Component
public class BusinessService {
    public String hello(String name) {
        return "hello " + name;
    }
}
