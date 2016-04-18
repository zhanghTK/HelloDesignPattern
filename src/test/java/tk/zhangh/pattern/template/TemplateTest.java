package tk.zhangh.pattern.template;

import org.junit.Test;

/**
 * 模板模式测试
 * Created by ZhangHao on 2016/4/18.
 */
public class TemplateTest {
    @Test
    public void testTemplate(){
        AbstractTemplate template1 = new ConcreteTemplateA();
        AbstractTemplate template2 = new ConcreteTemplateB();
        template1.templateMethod();
        System.out.println("#############");
        template2.templateMethod();
    }
}