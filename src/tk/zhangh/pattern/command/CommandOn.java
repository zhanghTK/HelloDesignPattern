package tk.zhangh.pattern.command;

/**
 * Created by ZhangHao on 16/3/20.
 * 打开命令
 */
public class CommandOn implements Command{
    private CommandReceiver commandReceiver;

    public CommandOn(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        commandReceiver.turnOn();
    }
}
