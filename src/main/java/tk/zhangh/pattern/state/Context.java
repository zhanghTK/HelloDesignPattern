package tk.zhangh.pattern.state;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 * Created by ZhangHao on 2016/4/20.
 */
public class Context {
    private State state;
    private Map<String, String> map = new HashMap<String, String>();

    public void setState(State state) {
        this.state = state;
    }

    public void request(String id, String name){
        if (map.get(id) == null){
            state = new ConcreteStateA();
        }else {
            state = new ConcreteStateB();
        }
        map.put(id, name);
        state.handle(name);
    }
}
