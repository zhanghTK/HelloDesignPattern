package tk.zhangh.pattern.behavior.mediator;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/9.
 */
public class Financial implements Department{
    private static Logger logger = Logger.getLogger(Financial.class);
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
