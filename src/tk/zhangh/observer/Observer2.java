package tk.zhangh.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者2
 * 只关注主题的message2
 */
public class Observer2 implements Observer{
    String message2;
    String summary;

    public Observer2(Observable observable) {
        observable.addObserver(this);  // 观察者向主题注册
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            if (arg == null) {
                this.message2 = subject.getMessage2();
            }else {
                this.summary = (String)arg;
            }
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Observer2{" +
                "summary='" + summary + '\'' +
                ", message2='" + message2 + '\'' +
                '}';
    }
}
