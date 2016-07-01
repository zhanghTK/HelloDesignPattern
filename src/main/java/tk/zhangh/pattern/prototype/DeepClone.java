package tk.zhangh.pattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * 原型模式，深拷贝创建对象
 * Created by ZhangHao on 2016/7/1.
 */
public class DeepClone implements Cloneable, Serializable{
    private String name;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object =  super.clone();

        DeepClone sheep = (DeepClone)object;
        sheep.date = (Date)this.date.clone();

        return object;
    }

    public Object deepClone() throws Exception{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public DeepClone(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeepClone)) return false;

        DeepClone deepClone = (DeepClone) o;

        if (getName() != null ? !getName().equals(deepClone.getName()) : deepClone.getName() != null) return false;
        return !(getDate() != null ? !getDate().equals(deepClone.getDate()) : deepClone.getDate() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        return result;
    }
}
