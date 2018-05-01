package prototype;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        EmailWithDeepClone email = new EmailWithDeepClone();
        email.setFrom("Tom");
        email.setReceiver("wesley");
        Attachment attachment = new Attachment();
        attachment.setFileName("原型模式作业");
        attachment.setInfo("这是原型模式作业");
        email.setAttachment(attachment);
        System.out.println(attachment);
        EmailWithDeepClone copyEmail = (EmailWithDeepClone)email.clone();

        System.out.println(copyEmail==email);

        System.out.println(copyEmail.getAttachment()==email.getAttachment());
        System.out.println(attachment);
    }
}
