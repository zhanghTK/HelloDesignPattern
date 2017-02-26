package tk.zhangh.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 坐标管理
 * 负责保存备忘录
 * Created by ZhangHao on 17/2/26.
 */
public class PositionCaretaker {
    private List<PositionMemento> mementos = new ArrayList<>();

    public PositionMemento getMemento(int setp) {
        return mementos.get(setp);
    }

    public void setMemento(PositionMemento memento) {
        mementos.add(memento);
    }
}
