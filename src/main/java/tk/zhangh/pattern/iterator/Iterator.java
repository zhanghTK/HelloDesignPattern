package tk.zhangh.pattern.iterator;

/**
 * 迭代器接口
 * Created by ZhangHao on 2016/4/19.
 */
public interface Iterator {
    Object first();
    Object next();
    Object currentItem();
    boolean isDone();
}
