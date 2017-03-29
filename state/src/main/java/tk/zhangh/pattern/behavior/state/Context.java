package tk.zhangh.pattern.behavior.state;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下文环境
 * 封装状态
 * Created by ZhangHao on 17/3/29.
 */
@Data
public class Context {
    private List<State> states = new ArrayList<>();

    private int index;

    public Context() {
        index = 0;
        states.add(new StartState());
        states.add(new RunningState());
        states.add(new StopState());
    }

    public void start() {
        index = -1;
        next();
    }

    public void next() {
        if (++index >= states.size()) {
            throw new RuntimeException("has finished");
        }
        State state = states.get(index);
        state.handle();
    }
}
