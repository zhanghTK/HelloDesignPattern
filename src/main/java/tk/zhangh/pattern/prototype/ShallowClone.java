package tk.zhangh.pattern.prototype;

import java.util.Date;

/**
 * 原型模式，浅拷贝创建对象
 * Created by ZhangHao on 2016/7/1.
 */
public class ShallowClone implements Cloneable{
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
        return object;
    }

    public ShallowClone(String name, Date date) {
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
        if (!(o instanceof ShallowClone)) return false;

        ShallowClone that = (ShallowClone) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return !(getDate() != null ? !getDate().equals(that.getDate()) : that.getDate() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        return result;
    }
}
