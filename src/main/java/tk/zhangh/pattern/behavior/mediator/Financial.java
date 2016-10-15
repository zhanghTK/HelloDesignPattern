package tk.zhangh.pattern.behavior.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/7/9.
 */
public class Financial implements Department{
    private static Logger logger = LoggerFactory.getLogger(Financial.class);
    private Mediator mediator;

    public Financial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Financial", this);
    }

    @Override
    public void selfAction() {
        logger.info("Financial self action\n");
    }

    @Override
    public void outAction() {
        logger.info("Financial out action");
    }
}
