package cn.daimaniu.blog.mail;

public interface IMailSender {
    boolean send(String to, String toName, String body);
}
