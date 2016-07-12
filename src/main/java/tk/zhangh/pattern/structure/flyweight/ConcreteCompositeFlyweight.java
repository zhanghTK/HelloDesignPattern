package tk.zhangh.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ConcreteCompositeFlyweight implements Flyweight{
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key , Flyweight fly){
        files.put(key,fly);
    }
    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;
        for(Object o : files.keySet()){
            fly = files.get(o);
            fly.operation(state);
        }

    }
}
