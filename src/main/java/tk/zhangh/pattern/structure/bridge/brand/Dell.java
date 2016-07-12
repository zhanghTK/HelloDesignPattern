package tk.zhangh.pattern.structure.bridge.brand;

/**
 * Created by ZhangHao on 2016/7/3.
 */
public class Dell implements Brand {
    @Override
    public String getName() {
        return "Dell";
    }

    @Override
    public void sale() {
        System.out.println("Dell's sale");
    }
}
