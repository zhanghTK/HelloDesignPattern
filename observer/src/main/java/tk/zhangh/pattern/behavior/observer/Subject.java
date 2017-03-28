package tk.zhangh.pattern.behavior.observer;

import lombok.Data;

import java.util.Observable;

/**
 * 主题类,可观察对象
 * Created by ZhangHao on 17/3/29.
 */
@Data
public class Subject extends Observable {
    private String subject;

    public void notifyChangeByPull() {
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public void notifyChangeByPush() {
        setChanged();
        notifyObservers(subject);
        clearChanged();
    }
}
