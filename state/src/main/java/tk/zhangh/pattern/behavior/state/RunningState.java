package tk.zhangh.pattern.behavior.state;

import java.util.concurrent.TimeUnit;

/**
 * 运行状态
 * 封装运行状态对应的行为
 * Created by ZhangHao on 17/3/29.
 */
public class RunningState implements State {
    @Override
    public void handle() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
