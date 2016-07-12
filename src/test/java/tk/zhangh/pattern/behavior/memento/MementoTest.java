package tk.zhangh.pattern.behavior.memento;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhangHao on 2016/7/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MementoConf.class)
public class MementoTest {
    private static Logger logger = Logger.getLogger(MementoTest.class);

    @Autowired
    CareTaker careTaker;

    @Autowired
    Emp emp;

    @Test
    public void testMemento() {
        logger.info(emp.toString());
        careTaker.setMemento(emp.memento());
        emp.setName("name2");
        emp.setAge(2);
        emp.setSalary(2000);
        logger.info(emp.toString());
        emp.recovery(careTaker.getMemento());
        logger.info(emp.toString());
    }
}