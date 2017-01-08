package tk.zhangh.pattern.behavior.chain;

import lombok.Data;

/**
 * 责任链模式里的Handler
 * Created by ZhangHao on 17/1/3.
 */
@Data
public abstract class AbstractLeader {
    protected String name;
    protected AbstractLeader nextLeader;

    public AbstractLeader(String name, AbstractLeader nextLeader) {
        this.name = name;
        this.nextLeader = nextLeader;
    }

    public abstract String handleRequest(LeaveRequest request);
}
