package prototype;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description: 测试beanCopy
 */
public class BeanCopyTest {

    public static void main(String[] args) {

        EmailWithBeanCopy email = new EmailWithBeanCopy();
        email.setFrom("Tom");
        email.setReceiver("wesley");
        Attachment attachment = new Attachment();
        attachment.setFileName("原型模式作业");
        attachment.setInfo("这是原型模式作业");
        email.setAttachment(attachment);
        System.out.println(attachment);

        EmailWithBeanCopy copyEmail = (EmailWithBeanCopy) email.clone();

        System.out.println(copyEmail == email);

        System.out.println(copyEmail.getAttachment() == email.getAttachment());
    }

}
