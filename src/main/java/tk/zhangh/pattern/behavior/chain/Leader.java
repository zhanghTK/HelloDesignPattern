package tk.zhangh.pattern.behavior.chain;

/**
 * 责任链抽象类
 * Created by ZhangHao on 2016/7/8.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
