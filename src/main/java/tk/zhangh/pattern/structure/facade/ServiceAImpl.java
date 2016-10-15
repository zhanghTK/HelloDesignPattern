package tk.zhangh.pattern.structure.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ServiceAImpl implements ServiceA{
    private Logger logger = LoggerFactory.getLogger(ServiceAImpl.class);
    public void methodA() {
        this.logger.info("");
    }
}
