package tk.zhangh.pattern.proxy.simple;

/**
 * Created by ZhangHao on 2016/3/8.
 */
public class SimpleProxyFactory {
    public static Subject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
