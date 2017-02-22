package tk.zhangh.pattern.behavior;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 迭代器模式测试
 * Created by ZhangHao on 17/1/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {IteratorTestConfig.class})
public class IteratorTest {

    @Autowired
    private ListItem listItem;
    @Autowired
    private ArrayItem arrayItem;

    @Test
    public void test_iterator_list() {
        Assert.assertEquals("HELLO", iterator(listItem.createIterator()));
    }

    @Test
    public void test_iterator_array() {
        Assert.assertEquals("HELLO", iterator(arrayItem.createIterator()));
    }

    private String iterator(Iterator iterator) {
        StringBuilder string = new StringBuilder();
        while (iterator.hasNext()) {
            string.append(iterator.next().toString());
        }
        return string.toString();
    }
}
