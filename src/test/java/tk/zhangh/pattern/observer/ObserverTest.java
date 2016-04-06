package tk.zhangh.pattern.observer;

import org.junit.Test;

import java.util.Observer;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者模式测试类
 */
public class ObserverTest {
    @Test
    public void testObserver(){
        // 主题类
        Subject subject = new Subject();

        // 观察者1对象
        Observer observer1 = new Observer1(subject);
        // 观察者2对象
        Observer observer2 = new Observer2(subject);

        // 更新主题
        subject.setMessage1("message1");
        subject.setMessage2("message2");
        // 主题类通知观察者
        System.out.println("被观察者推送");
        subject.notifyChangeByPush();
        System.out.println("观察者拉取");
        subject.notifyChangeByPull();
    }
}