package tk.zhangh.pattern.create.builder;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
