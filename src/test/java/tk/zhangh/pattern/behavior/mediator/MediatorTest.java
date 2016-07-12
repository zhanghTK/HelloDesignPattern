package tk.zhangh.pattern.behavior.mediator;

import org.junit.Test;
import tk.zhangh.pattern.behavior.mediator.*;

/**
 * Created by ZhangHao on 2016/7/11.
 */
public class MediatorTest {
    @Test
    public void testMediator() {
        Mediator mediator = new President();
        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Financial financial = new Financial(mediator);

        market.outAction();
        development.outAction();
        financial.outAction();
    }
}
