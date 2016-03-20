package tk.zhangh.pattern.command;

/**
 * Created by ZhangHao on 16/3/20.
 * 命令接收者
 */
public class CommandReceiver {
    public void turnOn() {
        System.out.println("turn on");
    }

    public void turnOff() {
        System.out.println("turn off");
    }
}
