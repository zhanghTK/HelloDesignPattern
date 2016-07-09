package tk.zhangh.pattern.iterators;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class App {
    public static void main(String[] args) {
        MyAggregate aggregate = new MyAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        MyIterator iterator = aggregate.concreteIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrent());
            iterator.next();
        }
    }
}
