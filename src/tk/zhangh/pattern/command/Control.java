package tk.zhangh.pattern.command;

/**
 * Created by ZhangHao on 16/3/20.
 * 控制器
 */
public class Control {
    private CommandOn commandOn;
    private CommandOff commandOff;

    public Control(CommandOn commandOn, CommandOff commandOff) {
        this.commandOn = commandOn;
        this.commandOff = commandOff;
    }

    public void turnOn(){
        commandOn.execute();
    }

    public void turnOff(){
        commandOff.execute();
    }
}
