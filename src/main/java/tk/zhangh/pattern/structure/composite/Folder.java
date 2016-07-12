package tk.zhangh.pattern.structure.composite;

import java.util.ArrayList;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public class Folder extends FileComponent {
    public Folder(String name){
        super(name);
        children = new ArrayList<>();
    }

    /**
     * 浏览文件夹中的文件
     */
    public void display() {
        System.out.println("这是文件夹，文件夹名为" + getName());
    }

    /**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(FileComponent file){
        children.add(file);
    }

    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(FileComponent file){
        children.remove(file);
    }
}
