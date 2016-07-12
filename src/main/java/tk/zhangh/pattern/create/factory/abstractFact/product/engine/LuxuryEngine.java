package tk.zhangh.pattern.create.factory.abstractFact.product.engine;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LuxuryEngine implements Engine{
    @Override
    public void start() {
        System.out.println("LuxuryEngine's start");
    }

    @Override
    public void run() {
        System.out.println("LuxuryEngine's run");
    }

    @Override
    public void stop() {
        System.out.println("LuxuryEngine's stop");
    }
}
