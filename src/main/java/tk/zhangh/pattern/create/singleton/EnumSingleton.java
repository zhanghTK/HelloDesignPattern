package tk.zhangh.pattern.create.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 枚举单例
 */
public enum EnumSingleton {
    INSTANCE;
    public void functionInEnum(){
        System.out.println("function in enum");
    }
}
