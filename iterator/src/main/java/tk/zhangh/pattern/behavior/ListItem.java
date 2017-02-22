package tk.zhangh.pattern.behavior;

import java.util.ArrayList;

/**
 * ArrayList包装
 * Created by ZhangHao on 17/1/28.
 */
public class ListItem {
    private ArrayList<String> items = new ArrayList<String>();

    public void addItem(String item) {
        items.add(item);
    }

    public Iterator createIterator() {
        return new ListIterator(items);
    }

    // 遍历ArrayList包装
    private class ListIterator implements Iterator {
        private int index = 0;
        private ArrayList<String> items;

        public ListIterator(ArrayList<String> items) {
            this.items = items;
        }

        public boolean hasNext() {
            return index < items.size();
        }

        public Object next() {
            return items.get(index++);
        }
    }
}
