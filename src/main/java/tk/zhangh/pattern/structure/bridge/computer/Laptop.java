package tk.zhangh.pattern.structure.bridge.computer;

import tk.zhangh.pattern.structure.bridge.brand.Brand;

/**
 * Created by ZhangHao on 2016/7/3.
 */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("Laptop's sale");
    }
}
