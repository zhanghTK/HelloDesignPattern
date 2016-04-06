package tk.zhangh.pattern.observer;

import java.util.Observable;

/**
 * Created by ZhangHao on 2016/3/12.
 * 主题类，被观察者
 */
public class Subject extends Observable{
    private String message1;  // 信息1
    private String message2;  // 信息2

    public void notifyChangeByPull(){
        setChanged();  // 更新新状态
        notifyObservers();  // 通知所有观察者拉取获取更新
    }

    public void notifyChangeByPush(){
        setChanged();  // 更新新状态
        notifyObservers("message1 is " + message1 + " message2 is " + message2);  // 向观察者推送消息
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
