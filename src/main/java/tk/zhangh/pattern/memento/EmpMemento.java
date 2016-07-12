package tk.zhangh.pattern.memento;

/**
 * Created by ZhangHao on 2016/7/12.
 */
public class EmpMemento {
    private String name;
    private int age;
    private double salary;

    public EmpMemento(Emp emp) {
        this.name = emp.getName();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
