package tk.zhangh.pattern.behavior.observer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者2
 * 只关注主题的subject2
 */
public class Observer2 implements Observer{
    private static Logger logger = LoggerFactory.getLogger(Observer2.class);
    private String subject;
    private String summary;

    public Observer2(Observable observable) {
        observable.addObserver(this);  // 观察者向主题注册
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            if (arg == null) {
                logger.info("拉取订阅主题2");
                this.subject = subject.getSubject2();
            }else {
                logger.info("被推送信息");
                this.summary = (String)arg;
            }
            logger.info(toString());
        }
    }

    @Override
    public String toString() {
        return "Observer2{" +
                "summary='" + summary + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
