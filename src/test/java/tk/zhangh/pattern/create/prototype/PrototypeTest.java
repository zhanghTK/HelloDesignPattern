package tk.zhangh.pattern.create.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by ZhangHao on 2016/7/1.
 */
public class PrototypeTest {
    /**
     * 测试浅拷贝
     * @throws Exception
     */
    @Test
    public void testShallowClone() throws Exception{
        ShallowClone obj1 = new ShallowClone("duoli", new Date());
        ShallowClone obj2 = (ShallowClone)obj1.clone();
        Assert.assertEquals(obj1, obj2);
        Thread.sleep(1000);
        obj1.setDate(new Date());
        Assert.assertEquals(obj1, obj1);
    }

    /**
     * 测试简单深拷贝
     * @throws Exception
     */
    @Test
    public void testSimpleDeepClone() throws Exception{
        DeepClone obj1 = new DeepClone("duoli", new Date());
        DeepClone obj2 = (DeepClone)obj1.clone();
        Assert.assertEquals(obj1, obj2);
        Thread.sleep(1000);
        obj1.setDate(new Date());
        Assert.assertNotSame(obj1, obj2);


    }

    /**
     * 测试序列化深拷贝
     * @throws Exception
     */
    @Test
    public void testSerializableDeepClone() throws Exception{
        DeepClone obj1 = new DeepClone("duoli", new Date());
        DeepClone obj2 = (DeepClone)obj1.deepClone();
        Assert.assertEquals(obj1, obj2);
        Thread.sleep(1000);
        obj1.setDate(new Date());
        Assert.assertNotSame(obj1, obj2);
    }
}