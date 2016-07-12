package tk.zhangh.pattern.structure.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangHao on 2016/7/8.
 */
public class ChessFlyweightFactory {
    private static Map<String, ChessFlyweight> map = new HashMap<>();

    public static ChessFlyweight getChess(String color) {
        ChessFlyweight chess = map.get(color);
        if (chess == null) {
            chess = new ChessConcrete(color);
            map.put(color, chess);
        }
        return chess;


    }
}
