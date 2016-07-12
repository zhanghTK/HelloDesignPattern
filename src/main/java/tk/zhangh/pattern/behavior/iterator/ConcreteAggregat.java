package tk.zhangh.pattern.behavior.iterator;

import java.util.Vector;

/**
 * Created by ZhangHao on 2016/4/20.
 */
public class ConcreteAggregat implements Aggregat{
    private Vector vector = null;

    public ConcreteAggregat() {
        this.vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
    }

    public Iterator createIterator() {
        return new ConcreteIterator(vector);
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }
}
