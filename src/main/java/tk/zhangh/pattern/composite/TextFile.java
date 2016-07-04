package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public class TextFile extends FileLeaf {
    public TextFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}
