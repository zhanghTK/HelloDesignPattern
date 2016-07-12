package tk.zhangh.pattern.behavior.mediator;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/9.
 */
public class Development implements Department{
    private static Logger logger = Logger.getLogger(Development.class);
    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Development", this);
    }

    @Override
    public void selfAction() {
        logger.info("Development self action");
    }

    @Override
    public void outAction() {
        logger.info("Development out action");
        mediator.command("Financial");
    }
}
