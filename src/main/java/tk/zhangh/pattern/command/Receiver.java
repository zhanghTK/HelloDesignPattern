package tk.zhangh.pattern.command;

/**
 * 真正命令执行者，包含若干个命令
 * Created by ZhangHao on 2016/4/13.
 */
public class Receiver {
    public void open(){
        System.out.println("open command...");
    }

    public void close(){
        System.out.println("close command...");
    }
}
