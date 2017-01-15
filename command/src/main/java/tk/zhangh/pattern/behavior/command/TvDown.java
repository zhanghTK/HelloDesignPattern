package tk.zhangh.pattern.behavior.command;

/**
 * 电视音量降低命令
 * Created by ZhangHao on 17/1/15.
 */
public class TvDown implements Command {
    private Tv tv;

    public TvDown(Tv door) {
        this.tv = door;
    }

    @Override
    public void execute() {
        tv.down();
    }
}
