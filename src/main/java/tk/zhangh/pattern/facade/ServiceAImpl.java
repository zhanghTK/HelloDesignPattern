package tk.zhangh.pattern.facade;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ServiceAImpl implements ServiceA{
    private Logger logger = Logger.getLogger(ServiceAImpl.class);
    public void methodA() {
        this.logger.info("");
    }
}
