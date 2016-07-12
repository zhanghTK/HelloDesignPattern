package tk.zhangh.pattern.behavior.chain;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class LeaveRequest {
    private String empName;
    private int leaveDays;
    private String leaveReason;

    public LeaveRequest(String empName, int leaveDays, String leaveReason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.leaveReason = leaveReason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
