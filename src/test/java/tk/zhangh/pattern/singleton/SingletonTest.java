package tk.zhangh.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ZhangHao on 2016/3/17.
 * 单例模式测试方法
 */
public class SingletonTest {

    @Test
    public void testLazyUnSafe() throws Exception {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testLazySafe(){
        LazySingletonSafe instance1 = LazySingletonSafe.getInstance();
        LazySingletonSafe instance2 = LazySingletonSafe.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testHungry(){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testLazyStatic(){
        LazySingletonStatic instance1 = LazySingletonStatic.getInstance();
        LazySingletonStatic instance2 = LazySingletonStatic.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testDoubleCheckLock(){
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testEnum(){
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        instance1.test();
        instance2.test();
        Assert.assertEquals(instance1, instance2);
    }
}