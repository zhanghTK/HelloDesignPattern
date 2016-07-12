package tk.zhangh.pattern.structure.composite;

import java.util.List;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public abstract class FileComponent {
    protected List<FileComponent> children;
    private String name;

    public FileComponent(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileComponent> getChildren() {
        return children;
    }

    public abstract void display();
}