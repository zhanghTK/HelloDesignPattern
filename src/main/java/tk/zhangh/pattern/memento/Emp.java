package tk.zhangh.pattern.memento;

/**
 * Created by ZhangHao on 2016/7/12.
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento empMemento) {
        name = empMemento.getName();
        age = empMemento.getAge();
        salary = empMemento.getSalary();
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
