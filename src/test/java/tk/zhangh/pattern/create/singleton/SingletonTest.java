package tk.zhangh.pattern.create.singleton;

import org.junit.Assert;
import org.junit.Test;
import tk.zhangh.pattern.create.singleton.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ZhangHao on 2016/3/17.
 * 单例模式测试方法
 */
public class SingletonTest {

    /**
     * 测试简单懒汉单例
     * @throws Exception
     */
    @Test
    public void testSimpleLazy() throws Exception {
        LazySingletonSimple instance1 = LazySingletonSimple.getInstance();
        LazySingletonSimple instance2 = LazySingletonSimple.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试加锁懒汉单例
     */
    @Test
    public void testSafeLazy(){
        LazySingletonSafe instance1 = LazySingletonSafe.getInstance();
        LazySingletonSafe instance2 = LazySingletonSafe.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试饿汉单例
     */
    @Test
    public void testHungry(){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试静态内部类懒汉单例
     */
    @Test
    public void testLazyStatic(){
        LazySingletonStatic instance1 = LazySingletonStatic.getInstance();
        LazySingletonStatic instance2 = LazySingletonStatic.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试双重校验锁单例
     */
    @Test
    public void testDoubleCheckLock(){
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试枚举单例
     */
    @Test
    public void testEnum(){
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        instance1.functionInEnum();
        instance2.functionInEnum();
        Assert.assertEquals(instance1, instance2);
    }

    /**
     * 测试反射创建单例
     */
    @Test
    public void testReflect() {
        DefReflectAndSerialSingleton instance1 = DefReflectAndSerialSingleton.getInstance();
        DefReflectAndSerialSingleton instance2 = null;
        try {
            Class clazz = Class.forName("tk.zhangh.pattern.singleton.DefReflectAndSerialSingleton");
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            instance2 = (DefReflectAndSerialSingleton)constructor.newInstance();
        } catch (Exception e) {
            Assert.assertNotNull(instance1);
            Assert.assertNull(instance2);
        }
    }

    /**
     * 测试反序列化创建单例
     */
    @Test
    public void testSerialize(){
        DefReflectAndSerialSingleton instance1 = DefReflectAndSerialSingleton.getInstance();
        DefReflectAndSerialSingleton instance2;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
            objectOutputStream.writeObject(instance1);


            objectInputStream = new ObjectInputStream(new FileInputStream("d:/a.txt"));
            instance2 = (DefReflectAndSerialSingleton)objectInputStream.readObject();
            Assert.assertEquals(instance1, instance2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 测试效率
     * @throws Exception
     */
    @Test
    public void testEfficiency() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
//                        DoubleCheckLockSingleton.getInstance();
//                        Object o = EnumSingleton.INSTANCE;
//                        HungrySingleton.getInstance();
//                        LazySingletonSafe.getInstance();
                        LazySingletonStatic.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}