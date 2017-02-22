package tk.zhangh.pattern.behavior;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者实现类
 * 星型结构的中心
 * Created by ZhangHao on 17/2/22.
 */
public class MessageCenter implements Mediator {

    private List<Person> persons = new ArrayList<>();

    @Override
    public void contact(String no, String message) {
        persons.get(Integer.valueOf(no)).called(message);
    }

    public void register(Person person) {
        person.register(this);
        persons.add(person);
    }

    public Person getPerson(String no) {
        return persons.get(Integer.valueOf(no));
    }
}
