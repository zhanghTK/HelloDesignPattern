package tk.zhangh.pattern.factory.abstractFact.product.seat;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LuxurySeat implements Seat{
    @Override
    public void massage() {
        System.out.println("LuxurySeat's seat");
    }
}
