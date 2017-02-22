package tk.zhangh.pattern.behavior;

/**
 * 数组包装
 * Created by ZhangHao on 17/1/28.
 */
public class ArrayItem {
    private static final int MAX_SIZE = 1024;
    private String[] items = new String[MAX_SIZE];
    private int index = 0;

    public void addItem(String item) {
        if (index >= MAX_SIZE) {
            return;
        }
        items[index++] = item;
    }

    public Iterator createIterator() {
        return new ArrayIterator(items);
    }

    // 遍历数组包装
    private class ArrayIterator implements Iterator {
        String[] items;
        int position = 0;

        public ArrayIterator(String[] items) {
            this.items = items;
        }

        public Object next() {
            String items = this.items[position];
            position = position + 1;
            return items;
        }

        public boolean hasNext() {
            return !(position >= items.length || items[position] == null);
        }
    }

}
