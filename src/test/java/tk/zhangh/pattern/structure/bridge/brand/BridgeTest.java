package tk.zhangh.pattern.structure.bridge.brand;

import org.junit.Assert;
import org.junit.Test;
import tk.zhangh.pattern.structure.bridge.brand.Dell;
import tk.zhangh.pattern.structure.bridge.brand.Lenovo;
import tk.zhangh.pattern.structure.bridge.computer.Computer;
import tk.zhangh.pattern.structure.bridge.computer.Laptop;
import tk.zhangh.pattern.structure.bridge.computer.PC;

/**
 * Created by ZhangHao on 2016/7/3.
 */
public class BridgeTest {
    @Test
    public void testBridge() {
        Computer computer = new PC(new Lenovo());
        Assert.assertEquals(computer.getBrand().getName(), "Lenovo");
        Assert.assertEquals(computer instanceof PC, true);

        computer = new Laptop(new Dell());
        Assert.assertEquals(computer.getBrand().getName(), "Dell");
        Assert.assertEquals(computer instanceof Laptop, true);
    }
}