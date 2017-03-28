package tk.zhangh.pattern.behavior.observer;

/**
 * 运行观察者模式
 * Created by ZhangHao on 17/3/29.
 */
public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();
        SubObserver subObserver = new SubObserver(subject);
        subject.setSubject("hello");
        subject.notifyChangeByPush();
        subject.setSubject("world");
        subject.notifyChangeByPull();
    }
}
