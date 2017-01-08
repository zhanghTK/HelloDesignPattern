package tk.zhangh.pattern.behavior.chain;

/**
 * 责任链模式中的ConcreteHandler
 * Created by ZhangHao on 17/1/3.
 */
public class Leader3 extends AbstractLeader {

    public Leader3(String name, AbstractLeader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public String handleRequest(LeaveRequest request) {
        if (request.getDays() >= 30) {
            return "驳回";
        }
        return Leader3.class.getSimpleName();
    }
}
