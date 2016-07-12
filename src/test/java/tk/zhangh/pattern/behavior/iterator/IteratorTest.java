package tk.zhangh.pattern.behavior.iterator;

import org.junit.Test;
import tk.zhangh.pattern.behavior.iterator.Aggregat;
import tk.zhangh.pattern.behavior.iterator.ConcreteAggregat;
import tk.zhangh.pattern.behavior.iterator.Iterator;

/**
 * Created by ZhangHao on 2016/4/20.
 */
public class IteratorTest {
    @Test
    public void testIterator(){
        Aggregat aggregat = new ConcreteAggregat();
        Iterator iterator = aggregat.createIterator();
        System.out.println(iterator.first());
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}