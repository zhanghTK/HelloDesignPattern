package tk.zhangh.pattern.proxy.Dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class DynProxyFactory {
    public static Subject getInstance(){
        Subject realSubject = new RealSubject();  // ���������
        // �������,�˶�����������ʱ��̬���ɵĶ���
        Subject proxy = (Subject) Proxy.newProxyInstance(
                // ClassLoader���󣬶������ĸ�ClassLoader�����������ɵĴ���������
                realSubject.getClass().getClassLoader(),
                // һ��Interface��������飬��ʾ������Ķ�����Ҫʵ����Щ�ӿ�
                realSubject.getClass().getInterfaces(),
                // һ��InvocationHandler���󣬱�ʾ��̬��������ڵ��÷���ʱ�������ĸ�InvocationHandler����
                new SubjectInvocationHandler(realSubject));
        return proxy;
    }
}
