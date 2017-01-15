package tk.zhangh.pattern.behavior.command;

/**
 * 电灯亮度调暗命令
 * Created by ZhangHao on 17/1/15.
 */
public class LightDown implements Command {
    private Light light;

    public LightDown(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }
}
