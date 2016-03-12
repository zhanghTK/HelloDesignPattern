package tk.zhangh.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者1
 * 只关注主题的message1
 */
public class Observer1 implements Observer{
//    Observable observable;  // 主题（被观察者）
    String message1;
    String summary;

    public Observer1(Observable observable) {
//        this.observable = observable;
        observable.addObserver(this);  // 观察者向主题注册
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            if (arg == null) {
                this.message1 = subject.getMessage1();
            }else {
                this.summary = (String)arg;
            }
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Observer1{" +
                "summary='" + summary + '\'' +
                ", message1='" + message1 + '\'' +
                '}';
    }
}
