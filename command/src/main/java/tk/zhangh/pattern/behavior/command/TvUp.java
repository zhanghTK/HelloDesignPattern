package tk.zhangh.pattern.behavior.command;

/**
 * 电视音量调高命令
 * Created by ZhangHao on 17/1/15.
 */
public class TvUp implements Command {
    private Tv tv;

    public TvUp(Tv door) {
        this.tv = door;
    }

    @Override
    public void execute() {
        tv.up();
    }
}
