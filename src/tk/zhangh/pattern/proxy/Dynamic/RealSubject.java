package tk.zhangh.pattern.proxy.Dynamic;


/**
 * Created by ZhangHao on 2016/3/8.
 */
public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("will do " + taskName);
        try {
            Thread.sleep(3000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(taskName + "has finished!");
    }
}
