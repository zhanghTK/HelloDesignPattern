package tk.zhangh.pattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class FlyweightFactory {
    private Map<Character, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyWeight(Character state) {
        Flyweight flyweight = flyweights.get(state);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(state);
            flyweights.put(state, flyweight);
        }
        return flyweight;
    }

    public Flyweight getFlyWeight(List<Character> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for(Character state : compositeState){
            compositeFly.add(state,this.getFlyWeight(state));
        }

        return compositeFly;
    }
}
