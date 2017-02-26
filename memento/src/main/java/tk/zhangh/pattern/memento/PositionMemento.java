package tk.zhangh.pattern.memento;

/**
 * 坐标备忘
 * 备忘录,存储原发器的内部状态
 * Created by ZhangHao on 17/2/26.
 */
public final class PositionMemento {
    private final int xPos;
    private final int yPos;

    public PositionMemento(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }
}
