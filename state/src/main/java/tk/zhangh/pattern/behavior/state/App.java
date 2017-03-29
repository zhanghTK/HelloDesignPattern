package tk.zhangh.pattern.behavior.state;

/**
 * 运行策略模式
 * Created by ZhangHao on 17/3/29.
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.start();
        while (true) {
            context.next();
        }
    }
}
