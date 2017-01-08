package tk.zhangh.pattern.behavior.chain;

/**
 * 责任链模式中的ConcreteHandler
 * Created by ZhangHao on 17/1/3.
 */
public class Leader2 extends AbstractLeader {

    public Leader2(String name, AbstractLeader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public String handleRequest(LeaveRequest request) {
        if (request.getDays() >= 10) {
            return nextLeader.handleRequest(request);
        }
        return Leader2.class.getSimpleName();
    }
}
