package tk.zhangh.pattern.behavior.mediator;

/**
 * Created by ZhangHao on 2016/7/9.
 */
public interface Mediator {
    void register(String deptName, Department department);
    void command(String deptName);
}
