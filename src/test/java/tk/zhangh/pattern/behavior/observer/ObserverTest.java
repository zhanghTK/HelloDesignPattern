package tk.zhangh.pattern.behavior.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhangHao on 2016/3/12.
 * 观察者模式测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ObserverConf.class)
public class ObserverTest {

    @Autowired
    Subject subject;


    @Test
    public void test() {
        subject.setSubject1("subject1");
        subject.setSubject2("subject2");
        subject.notifyChangeByPush();
        subject.setSubject1("new subject1");
        subject.setSubject2("new subject2");
        subject.notifyChangeByPull();
    }
}