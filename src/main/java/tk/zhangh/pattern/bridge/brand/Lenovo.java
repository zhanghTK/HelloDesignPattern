package tk.zhangh.pattern.bridge.brand;

/**
 * Created by ZhangHao on 2016/7/3.
 */
public class Lenovo implements Brand {
    @Override
    public String getName() {
        return "Lenovo";
    }

    @Override
    public void sale() {
        System.out.println("Lenovo's sale");
    }
}
