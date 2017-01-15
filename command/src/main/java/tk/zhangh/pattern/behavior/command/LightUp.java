package tk.zhangh.pattern.behavior.command;

/**
 * 电灯亮度调亮命令
 * Created by ZhangHao on 17/1/15.
 */
public class LightUp implements Command {
    private Light light;

    public LightUp(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }
}
