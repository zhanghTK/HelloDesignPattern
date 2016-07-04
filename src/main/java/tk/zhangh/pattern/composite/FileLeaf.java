package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public abstract class FileLeaf extends FileComponent{
    public FileLeaf(String name) {
        super(name);
        children = null;
    }

    public abstract void display();
}
