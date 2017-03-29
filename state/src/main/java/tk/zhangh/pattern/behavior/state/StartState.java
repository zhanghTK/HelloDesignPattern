package tk.zhangh.pattern.behavior.state;

import java.util.concurrent.TimeUnit;

/**
 * 开始状态
 * 封装开始状态对应的行为
 * Created by ZhangHao on 17/3/29.
 */
public class StartState implements State {
    @Override
    public void handle() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("start");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
