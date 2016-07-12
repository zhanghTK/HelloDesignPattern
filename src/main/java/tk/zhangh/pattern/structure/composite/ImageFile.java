package tk.zhangh.pattern.structure.composite;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public class ImageFile extends FileLeaf {
    public ImageFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}
