package tk.zhangh.pattern.behavior.command;

/**
 * 命令的实现类，包装一个具体的命令
 * Created by ZhangHao on 2016/4/13.
 */
public class CommandClose implements Command{
    private Receiver receiver;

    public CommandClose(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.close();
    }

}
