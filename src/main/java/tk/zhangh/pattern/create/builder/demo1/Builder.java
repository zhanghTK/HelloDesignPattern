package tk.zhangh.pattern.create.builder.demo1;

/**
 * 复杂类型构建接口
 *
 * 建造者模式中的抽象构建者
 * Created by ZhangHao on 2016/10/15.
 */
public interface Builder<T> {
    T build();
}
