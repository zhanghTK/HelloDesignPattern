package tk.zhangh.pattern.structure.facade;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ServiceBImpl implements ServiceB{
    private Logger logger = Logger.getLogger(ServiceBImpl.class);
    public void methodB() {
        this.logger.info("");
    }
}
