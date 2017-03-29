package tk.zhangh.pattern.behavior.state;

import java.util.concurrent.TimeUnit;

/**
 * 结束状态
 * 封装结束状态对应的行为
 * Created by ZhangHao on 17/3/29.
 */
public class StopState implements State {
    @Override
    public void handle() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
