package tk.zhangh.pattern.behavior.iterator;

import java.util.Vector;

/**
 * 迭代器具体实现
 * Created by ZhangHao on 2016/4/19.
 */
public class ConcreteIterator implements Iterator{
    private int index = 0;
    private Vector vector = null;

    public ConcreteIterator(Vector vector){
        this.vector = vector;
    }

    public Object first() {
        index = 0;
        return vector.get(index);
    }

    public Object next() {
        return vector.get(++index);
    }

    public Object currentItem() {
        return vector.get(index);
    }

    public boolean isDone() {
        return index >= vector.size()-1;
    }
}
