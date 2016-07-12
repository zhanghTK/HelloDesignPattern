package tk.zhangh.pattern.behavior.observer;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * Created by ZhangHao on 2016/3/12.
 * 主题类，被观察者
 */
@Component
public class Subject extends Observable{
    private static Logger logger = Logger.getLogger(Subject.class);
    private String subject1;  // 信息1
    private String subject2;  // 信息2

    public void notifyChangeByPull(){
        logger.info("通知观察者拉取更新内容");
        setChanged();  // 更新新状态
        notifyObservers();  // 通知所有观察者拉取获取更新
    }

    public void notifyChangeByPush(){
        logger.info("向观察者推送更新内容");
        setChanged();  // 更新新状态
        notifyObservers(String.format("subject1:%s,subject2:%s", subject1, subject2));  // 向观察者推送消息
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }
}
