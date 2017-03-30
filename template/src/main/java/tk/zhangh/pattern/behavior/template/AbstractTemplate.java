package tk.zhangh.pattern.behavior.template;

/**
 * 抽象模板
 * Created by ZhangHao on 17/3/30.
 */
public abstract class AbstractTemplate {
    public void steps() {
        first();
        second();
        third();
    }

    protected abstract void first();

    protected void hookMethod() {
    }

    protected void second() {
    }

    protected void third() {

    }
}
