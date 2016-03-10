package tk.zhangh.pattern.proxy.simple;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class ProxySubject implements Subject{
    // ʵ�ʱ��������
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void dealTask(String taskName) {
        long start = System.currentTimeMillis();  // AOP
        realSubject.dealTask(taskName);  // ִ�б��������ķ���
        long end = System.currentTimeMillis();  // AOP
        System.out.println("consuming " + (end - start) + "ms");
    }
}
