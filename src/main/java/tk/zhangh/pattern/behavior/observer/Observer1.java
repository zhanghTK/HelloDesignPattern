package tk.zhangh.pattern.behavior.observer;

import org.apache.log4j.Logger;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者1
 * 只关注主题的message1
 */
public class Observer1 implements Observer{
    private static Logger logger = Logger.getLogger(Observer1.class);
    private String message1;
    private String summary;

    public Observer1(Observable observable) {

        observable.addObserver(this);  // 观察者向主题注册
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            if (arg == null) {
                logger.info("拉取订阅主题1");
                this.message1 = subject.getSubject1();
            }else {
                logger.info("被推送信息");
                this.summary = (String)arg;
            }
            logger.info(toString());
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
