package tk.zhangh.pattern.behavior;

/**
 * 集合遍历接口
 * Created by ZhangHao on 17/1/28.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
