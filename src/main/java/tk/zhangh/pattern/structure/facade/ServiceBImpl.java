package tk.zhangh.pattern.structure.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ServiceBImpl implements ServiceB{
    private Logger logger = LoggerFactory.getLogger(ServiceBImpl.class);
    public void methodB() {
        this.logger.info("");
    }
}
