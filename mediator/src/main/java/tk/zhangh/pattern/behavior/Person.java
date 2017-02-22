package tk.zhangh.pattern.behavior;

/**
 * 同事对象
 * 星型结构的四周
 * 泛指互相有联系的业务类,通过中介者联系
 * Created by ZhangHao on 17/2/22.
 */
public class Person implements Mediator {

    private String name;
    private Mediator mediator;
    private String message;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void contact(String no, String message) {
        mediator.contact(no, message);
    }

    public String called(String message) {
        this.message = message;
        return message;
    }

    public void register(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getMessage() {
        return message;
    }
}
