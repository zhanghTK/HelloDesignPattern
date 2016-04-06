# 设计模式——代理模式

## 代理模式
[所谓的代理者是指一个类可以作为其它东西的接口](https://zh.wikipedia.org/wiki/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F)
![UML图](https://ooo.0o0.ooo/2016/04/05/57047f9a58a61.jpg)

在UML图中可以看到三个基本的角色类
**Subject**：抽象角色才，约定接口
**RealSubject**：被代理角色，实现业务逻辑
**Proxy**：代理对象，引用被代理对象，扩展被代理角色的业务逻辑

**抽象角色、被代理角色具体实现：**

    /**
     * Created by ZhangHao on 2016/3/8.
     * 代理抽象接口
     */
    public interface Subject {
        void sayHello(String hello);
        void syaBye(String bye);
    }

    /**
     * 被代理角色
     * 实现基本的业务逻辑
     * Created by ZhangHao on 2016/3/8.
     */
    public class RealSubject implements Subject {

        public void sayHello(String hello) {
            try {
                System.out.println(hello);
                Thread.sleep(3000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        public void syaBye(String bye) {
            try {
                System.out.println(bye);
                Thread.sleep(3000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


##简单代理

    /**
     * 静态代理类
     * Created by ZhangHao on 2016/3/8.
     */
    public class SimpleProxy implements Subject {
        // 实际被代理对象
        private Subject realSubject;

        public SimpleProxy(Subject realSubject) {
            this.realSubject = realSubject;
        }

        public void sayHello(String hello) {
            System.out.println("before...");
            long start = System.currentTimeMillis();
            realSubject.sayHello(hello);  // 执行被代理对象的方法
            long end = System.currentTimeMillis();
            System.out.println("consuming " + (end - start) + "ms");
            System.out.println("end...");
        }

        public void syaBye(String bye) {
            System.out.println("before...");
            long start = System.currentTimeMillis();
            realSubject.sayHello(bye);  // 执行被代理对象的方法
            long end = System.currentTimeMillis();
            System.out.println("consuming " + (end - start) + "ms");
            System.out.println("end...");
        }
    }


    /**
     * 测试静态代理类
     * Created by ZhangHao on 2016/3/8.
     */
    public class SimpleProxyTest {
        @Test
        public void testSimpleProxySubject(){
            Subject proxy = new SimpleProxy(new RealSubject());
            proxy.sayHello("hello world");
        }
    }

**特点：**
1. 代理类与与被代理关系固定，不具有弹性。当有多个被代理类时，需要多个代理类
2. 编译期必须确定代理关系，效率高，但灵活性差
3. 实现简单

##动态代理
### JDK动态代理
    /**
     * JDK实现的静态代理
     * Created by ZhangHao on 2016/3/8.
     */
    public class DynamicProxy implements InvocationHandler{

        // 被代理的真实对象
        private Object delegate;

        // 初始化被代理的真实对象
        public DynamicProxy(Object delegate) {
            this.delegate = delegate;
        }

        public <T> T getProxy(){
            return (T) Proxy.newProxyInstance(
                    // ClassLoader对象，定义由哪个ClassLoader对象来对生成的代理对象加载
                    delegate.getClass().getClassLoader(),
                    // 一个Interface对象的数组，表示被代理的对象需要实现哪些接口
                    delegate.getClass().getInterfaces(),
                    // 一个InvocationHandler对象，表示动态代理对象在调用方法时关联到哪个InvocationHandler对象
                    this
            );
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before...");
            long start = System.currentTimeMillis();  // AOP
            // 反射调用被代理对象的方法
            Object result = method.invoke(delegate, args);
            long end = System.currentTimeMillis();
            System.out.println("consuming " + (end - start) + "ms");  // AOP
            System.out.println("end...");
            return result;
        }
    }

    /**
     * JDK实现动态代理测试类
     * Created by ZhangHao on 2016/3/8.
     */
    public class DynamicProxyTest {
        @Test
        public void testDynamicProxy(){
            Subject subjectProxy = new DynamicProxy(new RealSubject()).getProxy();
            subjectProxy.sayHello("hello world!");
            subjectProxy.syaBye("bye");
        }
    }

**特点：**
1. 系统扩展性和维护性增强，避免引入多个代理类
2. 被代理对象必须实现接口
3. 可以运行时动态加入代理目标，速度比静态代理稍慢

### CGLib
    /**
     * cglib动态代理
     * Created by ZhangHao on 2016/4/6.
     */
    public class CGLibProxy implements MethodInterceptor {
        private volatile static CGLibProxy instance;
        private CGLibProxy(){}

        public <T> T getProxy(Class<T> cls){
            return (T) Enhancer.create(cls, this);
        }

        public static CGLibProxy getInstance(){
            if (instance == null){
                synchronized (CGLibProxy.class){
                    if (instance == null){
                        instance = new CGLibProxy();
                    }
                }
            }
            return instance;
        }

        public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("before...");
            long start = System.currentTimeMillis();  // AOP
            Object result = methodProxy.invokeSuper(object, args);
            long end = System.currentTimeMillis();
            System.out.println("consuming " + (end - start) + "ms");  // AOP
            System.out.println("end...");
            return result;
        }
    }

    /**
     * cglib动态代理测试类
     * Created by ZhangHao on 2016/4/6.
     */
    public class CGLibProxyTest {
        @Test
        public void testCglib(){
            Subject subjectProxy = CGLibProxy.getInstance().getProxy(RealSubject.class);
            subjectProxy.sayHello("hello world");
            subjectProxy.syaBye("Bye");
        }
    }
**特点：**
1. 好处与JDK动态代理类似，但避免了接口限制
2. 实际上cglib是针对代理类生成一个子类，覆盖其中方法，因此不能对final代理
3. 可以实现方法级别的代理

### [JDK动态代理与CGLib比较](http://www.itzhai.com/java-dong-tai-dai-li-zhi-jdk-dong-tai-dai-li-he-cglib-dong-tai-dai-li-mian-xiang-qie-mian-bian-cheng-aop-yuan-li.html#JDK动态代理)
CGLib所创建的动态代理对象的性能比JDK所创建的代理对象性能高不少，大概10倍
CGLib在创建代理对象时所花费的时间却比JDK动态代理多大概8倍
对于singleton的代理对象或者具有实例池的代理，因为无需频繁的创建新的实例，所以比较适合CGLib动态代理技术，反之则适用于JDK动态代理技术。