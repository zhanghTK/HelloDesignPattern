package tk.zhangh.pattern.behavior.chain;

import lombok.Data;

/**
 * 责任链中的请求对象
 * Created by ZhangHao on 17/1/3.
 */
@Data
public class LeaveRequest {
    private String name;
    private int days;
    private String reason;

    public LeaveRequest(String name, int days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }
}
