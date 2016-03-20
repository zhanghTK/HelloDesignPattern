package tk.zhangh.pattern.command;

/**
 * Created by ZhangHao on 16/3/20.
 * 关闭命令
 */
public class CommandOff implements Command{
    private CommandReceiver commandReceiver;

    public CommandOff(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        commandReceiver.turnOff();
    }
}
