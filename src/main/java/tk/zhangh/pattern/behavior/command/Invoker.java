package tk.zhangh.pattern.behavior.command;

/**
 * 所有命令的控制器
 * Created by ZhangHao on 2016/4/13.
 */
public class Invoker {
    private Command openCommand;

    private Command closeCommand;

    public Invoker(Command openCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }
}
