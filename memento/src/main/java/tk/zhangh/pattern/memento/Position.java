package tk.zhangh.pattern.memento;

/**
 * 坐标类
 * 原发器,需要保存状态的类
 * Created by ZhangHao on 17/2/26.
 */
public class Position {
    private int xPos;
    private int yPos;

    public Position(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String drawScreen() {
        return "position[" + xPos + "," + yPos + "]";
    }

    public PositionMemento save() {
        return new PositionMemento(xPos, yPos);
    }

    public void restore(PositionMemento memento) {
        this.xPos = memento.getX();
        this.yPos = memento.getY();
    }
}
