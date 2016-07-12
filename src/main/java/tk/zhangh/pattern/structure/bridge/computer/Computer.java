package tk.zhangh.pattern.structure.bridge.computer;

import tk.zhangh.pattern.structure.bridge.brand.Brand;

/**
 * Created by ZhangHao on 2016/7/3.
 */
public class Computer {
    protected Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }


}
