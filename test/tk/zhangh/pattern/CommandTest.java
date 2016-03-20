package tk.zhangh.pattern;

import org.junit.Test;
import tk.zhangh.pattern.command.CommandOff;
import tk.zhangh.pattern.command.CommandOn;
import tk.zhangh.pattern.command.CommandReceiver;
import tk.zhangh.pattern.command.Control;

/**
 * Created by ZhangHao on 16/3/20.
 * 命令模式测试方法
 */
public class CommandTest {
    @Test
    public void testCommand(){
        CommandReceiver commandReceiver = new CommandReceiver();
        CommandOn commandOn = new CommandOn(commandReceiver);
        CommandOff commandOff = new CommandOff(commandReceiver);

        Control command = new Control(commandOn, commandOff);
        command.turnOn();
        command.turnOff();
    }
}
