package tk.zhangh.pattern.behavior.memento;

/**
 * Created by ZhangHao on 2016/7/12.
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
