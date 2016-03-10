package tk.zhangh.pattern.proxy.simple;


/**
 * Created by ZhangHao on 2016/3/8.
 */
public class RealSubject implements Subject{
    @Override
    public void dealTask(String taskName) {
        System.out.println("do dealTask...");
        try {
            Thread.sleep(5000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("dealTask finished!");
    }
}
