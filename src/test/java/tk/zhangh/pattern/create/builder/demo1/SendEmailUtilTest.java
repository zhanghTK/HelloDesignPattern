package tk.zhangh.pattern.create.builder.demo1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 邮件发送工具类客户端
 * 建造者模式测试类
 * Created by ZhangHao on 2016/10/15.
 */
public class SendEmailUtilTest {

    private List<String> subjects = getList();  // 邮件主题
    private List<String> contents = getList();  // 邮件内容
    private List<String> toPersons = getList();  // 收件人
    private List<String> ccPersons = getList();  // 抄送人
    private List<String> bccPersons = getList();  // 暗送人
    private List<String> fileNames = getList();  // 文件名称列表
    private String docName = "docName";  // 文档名称
    private String fileName = "fileName";  // 单个文件名称

    @Test
    public void testSendEmail() throws Exception {
        EmailSendMain email =
                new EmailSendMain.Builder("邮件模版名",toPersons).
                        subjects(subjects).
                        contents(contents).
                        ccPersons(ccPersons).
                        bccPersons(bccPersons).build();
        SendEmailUtil.sendEmail(email);
    }

    @Test
    public void testSendEmail1() throws Exception {
        SendEmailUtil.sendEmail("邮件模版名", subjects, contents, toPersons, ccPersons, bccPersons);
    }

    @Test
    public void testSendEmail2() throws Exception {
        SendEmailUtil.sendEmail("邮件模版名", subjects, contents, toPersons, ccPersons, bccPersons, docName, fileName);
    }

    @Test
    public void testSendEmail3() throws Exception {
        SendEmailUtil.sendEmail("邮件模版名", subjects, contents, toPersons, ccPersons, bccPersons, docName, fileNames);
    }

    private List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("arg1");
        list.add("arg2");
        list.add("arg3");
        list.add("arg4");
        return list;
    }
}