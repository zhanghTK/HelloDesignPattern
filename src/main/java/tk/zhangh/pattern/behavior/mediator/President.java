package tk.zhangh.pattern.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangHao on 2016/7/11.
 */
public class President implements Mediator{
    private Map<String, Department> map = new HashMap<>();
    @Override
    public void register(String deptName, Department department) {
        map.put(deptName, department);
    }

    @Override
    public void command(String deptName) {
        map.get(deptName).selfAction();
    }
}
