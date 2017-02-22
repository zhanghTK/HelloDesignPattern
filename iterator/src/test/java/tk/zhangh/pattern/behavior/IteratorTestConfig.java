package tk.zhangh.pattern.behavior;

import org.springframework.context.annotation.Bean;

/**
 * 迭代器模式测试配置
 * Created by ZhangHao on 17/1/28.
 */
public class IteratorTestConfig {
    @Bean
    public ListItem listItem() {
        ListItem items = new ListItem();
        items.addItem("H");
        items.addItem("E");
        items.addItem("L");
        items.addItem("L");
        items.addItem("O");
        return items;
    }

    @Bean
    public ArrayItem arrayItem() {
        ArrayItem items = new ArrayItem();
        items.addItem("H");
        items.addItem("E");
        items.addItem("L");
        items.addItem("L");
        items.addItem("O");
        return items;
    }
}
