package tk.zhangh.pattern.create.builder.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 邮件发送工具类
 * Created by ZhangHao on 2016/10/15.
 */
public final class SendEmailUtil {
    private static final Logger logger = LoggerFactory.getLogger(SendEmailUtil.class);
    /**
     * 邮件发送通用接口
     * @param email 邮件发送参数对象
     */
    public static void sendEmail(EmailSendMain email){
        logger.info("send email:" + email);
        if ((email.getDocName() == null || email.getDocName().equals("")) ||
                (email.getFileNames() == null || email.getFileNames().size() == 0)) {
            sendEmail(email.getTemplate(), email.getSubjects(), email.getContents(), email.getToPersons(),
                    email.getCcPersons(), email.getBccPersons());
        }else {
            sendEmail(email.getTemplate(), email.getSubjects(), email.getContents(), email.getToPersons(),
                    email.getCcPersons(), email.getBccPersons(), email.getDocName(), email.getFileNames());
        }
    }

    /**
     * 不帶附件的邮件发送
     * 未使用建造者模式的原始方法（不良代码）
     * @param template                      模板
     * @param subjects                      主题
     * @param contents                      内容
     * @param toPersons                     收件人
     * @param ccPersons                     抄送人
     * @param bccPersons                    暗送人
     */
    public static void sendEmail(String template, List<String> subjects, List<String> contents, List<String> toPersons,
                                  List<String> ccPersons, List<String> bccPersons){
        logger.info("send email");
    }


    /**
     * 带附件的邮件发送
     * 未使用建造者模式的原始方法（不良）
     * @param template                      模板
     * @param subjects                      主题
     * @param contents                      内容
     * @param toPersons                     收件人
     * @param ccPersons                     抄送人
     * @param bccPersons                    暗送人
     * @param docName                       文档名称
     * @param fileName                      文件名称(单个文件)
     */
    public static void sendEmail(String template, List<String> subjects, List<String> contents, List<String> toPersons,
                                  List<String> ccPersons, List<String> bccPersons, String docName, String fileName){
        logger.info("send email");
    }

    /**
     * 带附件的邮件发送
     * 未使用建造者模式的原始方法（不良代码）
     * @param template                      模板
     * @param subjects                      主题
     * @param contents                      内容
     * @param toPersons                     收件人
     * @param ccPersons                     抄送人
     * @param bccPersons                    暗送人
     * @param docName                       文档名称
     * @param fileNames                     文件名称(多个文件,文件名称列表)
     */
    public static void sendEmail(String template, List<String> subjects, List<String> contents, List<String> toPersons,
                                  List<String> ccPersons, List<String> bccPersons, String docName, List<String> fileNames){
        logger.info("send email");
    }
}
