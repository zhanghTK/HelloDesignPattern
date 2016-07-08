package tk.zhangh.pattern.flyweight.chess;

import org.apache.log4j.Logger;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ChessConcrete implements ChessFlyweight{
    private String color;
    private static Logger logger = Logger.getLogger(ChessConcrete.class);

    public ChessConcrete(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        logger.info(String.format("Chess's color:%s,coordinate:%s", color, coordinate));
    }
}
