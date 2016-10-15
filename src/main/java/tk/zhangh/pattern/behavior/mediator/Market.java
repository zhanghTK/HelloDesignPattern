package tk.zhangh.pattern.behavior.mediator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/7/9.
 */
public class Market implements Department{
    private static Logger logger = LoggerFactory.getLogger(Market.class);
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Market", this);
    }

    @Override
    public void selfAction() {
        logger.info("Market self action");
    }

    @Override
    public void outAction() {
        logger.info("Market out action");
        mediator.command("Financial");
    }
}
