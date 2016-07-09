package tk.zhangh.pattern.iterators;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrent();
}
