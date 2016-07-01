package tk.zhangh.pattern.factory.abstractFact.product.seat;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LowSeat implements Seat{
    @Override
    public void massage() {
        System.out.println("LowSeat's seat");
    }
}
