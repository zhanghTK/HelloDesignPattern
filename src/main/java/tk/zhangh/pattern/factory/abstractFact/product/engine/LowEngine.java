package tk.zhangh.pattern.factory.abstractFact.product.engine;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LowEngine implements Engine{
    @Override
    public void start() {
        System.out.println("LowEngine's start");
    }

    @Override
    public void run() {
        System.out.println("LowEngine's run");
    }

    @Override
    public void stop() {
        System.out.println("LowEngine's stop");
    }
}
