package tk.zhangh.pattern.behavior.command;

/**
 * 调用者
 * Created by ZhangHao on 17/1/15.
 */
public class Invoke {
    private Command upCommand;
    private Command downCommand;

    public Invoke(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void down() {
        downCommand.execute();
    }

    public void up() {
        upCommand.execute();
    }
}
