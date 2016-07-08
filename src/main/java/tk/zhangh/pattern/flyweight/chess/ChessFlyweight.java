package tk.zhangh.pattern.flyweight.chess;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public interface ChessFlyweight {
    String getColor();
    void display(Coordinate coordinate);
}
