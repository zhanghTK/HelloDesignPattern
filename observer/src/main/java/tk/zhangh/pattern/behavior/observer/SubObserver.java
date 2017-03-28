package tk.zhangh.pattern.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 主题类的观察者
 * Created by ZhangHao on 17/3/29.
 */
public class SubObserver implements Observer {
    public SubObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            Subject subject = (Subject) o;
            if (arg == null) {
                System.out.println("pull data:" + subject.getSubject());
            } else {
                System.out.println("pushed date:" + arg);
            }
        }
    }
}
