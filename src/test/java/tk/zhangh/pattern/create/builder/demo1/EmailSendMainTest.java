package tk.zhangh.pattern.create.builder.demo1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2016/10/15.
 */
public class EmailSendMainTest {
    @Test
    public void testEmailSendMain() {

        EmailSendMain emailSendMain = new EmailSendMain.Builder("", getToPersons()).build();
        SendEmailUtil.sendCommon(emailSendMain);
    }

    private List<String> getToPersons() {
        List<String> toPersons = new ArrayList<String>();
        toPersons.add("ZhangSan");
        toPersons.add("LiSi");
        return toPersons;
    }
}