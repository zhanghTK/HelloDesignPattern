package tk.zhangh.pattern.iterators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class MyAggregate {
    private List list = new ArrayList();

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void add(Object object) {
        list.add(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public MyIterator concreteIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{
        private int cursor = 0;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrent() {
            return list.get(cursor);
        }
    }
}
