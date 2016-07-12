package tk.zhangh.pattern.create.factory.abstractFact.product.tyre;

/**
 * Created by ZhangHao on 2016/6/30.
 */
public class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("LowTyre's revolve");
    }
}
