package tk.zhangh.pattern.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class SubjectInvocationHandler implements InvocationHandler{

    // ���������ʵ����
    private Object delegate;

    // ��ʼ�����������ʵ����
    public SubjectInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();  // AOP
        long start = System.currentTimeMillis();  // AOP
        // ������ñ��������ķ���
        method.invoke(delegate, args);
        long end = System.currentTimeMillis();
        System.out.println("consuming " + (end - start) + "ms");  // AOP
        doAfter();  // AOP
        return null;
    }


    private void doBefore(){
        System.out.println("do something before invoke method...");
    }

    private void doAfter(){
        System.out.println("do something after invoke method...");
    }
}
