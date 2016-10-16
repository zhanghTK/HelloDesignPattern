package tk.zhangh.pattern.create.builder.demo1;

import java.util.List;

/**
 * 邮件发送参数对象
 * 包含多个字段的复杂类型，使用内部类实现Builder接口创建对象
 *
 * 建造者模式中的产品类
 * Created by ZhangHao on 2016/10/15.
 */
public final class EmailSendMain {
    private final String template;  // 模板名称
    private final List<String> subjects;  // 主题参数列表
    private final List<String> contents;  // 内容参数列表
    private final List<String> toPersons;  // 收件人列表
    private final List<String> ccPersons;  // 抄送人列表
    private final List<String> bccPersons;  // 暗送人列表
    private final String docName;  // 文档名称
    private final List<String> fileNames;  // 文件名称列表

    private EmailSendMain(Builder builder) {
        this.template = builder.template;
        this.subjects = builder.subjects;
        this.contents = builder.contents;
        this.toPersons = builder.toPersons;
        this.ccPersons = builder.ccPersons;
        this.bccPersons = builder.bccPersons;
        this.docName = builder.docName;
        this.fileNames = builder.fileNames;
    }

    /**
     * 实现Builder接口的构建类，用于创建EmailSendMain
     *
     * 建造者模式中的建造类
     */
    public static class Builder implements tk.zhangh.pattern.create.builder.demo1.Builder<EmailSendMain> {
        private String template;  // 模板名称
        private List<String> subjects;  // 主题参数列表
        private List<String> contents;  // 内容参数列表
        private List<String> toPersons;  // 收件人列表
        private List<String> ccPersons;  // 抄送人列表
        private List<String> bccPersons;  // 暗送人列表
        private String docName;  // 文档名称
        private List<String> fileNames;  // 文件名称列表

        public Builder(String template, List<String> toPersons) {
            this.template = template;
            this.toPersons = toPersons;
        }

        @Override
        public EmailSendMain build() {
            return new EmailSendMain(this);
        }

        public Builder subjects(List<String> subjects) {
            this.subjects = subjects;
            return this;
        }

        public Builder contents(List<String> contents) {
            this.contents = contents;
            return this;
        }

        public Builder ccPersons(List<String> ccPersons) {
            this.ccPersons = ccPersons;
            return this;
        }

        public Builder bccPersons(List<String> bccPersons) {
            this.bccPersons = bccPersons;
            return this;
        }

        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        public Builder fileNames(List<String> fileNames) {
            this.fileNames = fileNames;
            return this;
        }
    }

    public String getTemplate() {
        return template;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<String> getContents() {
        return contents;
    }

    public List<String> getToPersons() {
        return toPersons;
    }

    public List<String> getCcPersons() {
        return ccPersons;
    }

    public List<String> getBccPersons() {
        return bccPersons;
    }

    public String getDocName() {
        return docName;
    }

    public List<String> getFileNames() {
        return fileNames;
    }

    @Override
    public String toString() {
        return "EmailSendMain{" +
                "template='" + template + '\'' +
                ", subjects=" + subjects +
                ", contents=" + contents +
                ", toPersons=" + toPersons +
                ", ccPersons=" + ccPersons +
                ", bccPersons=" + bccPersons +
                ", docName='" + docName + '\'' +
                ", fileNames=" + fileNames +
                '}';
    }
}
