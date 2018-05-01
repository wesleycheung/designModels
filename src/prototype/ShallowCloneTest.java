package prototype;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */

public class ShallowCloneTest {




    public static void main(String[] args) {

        Email email = new Email();
        email.setFrom("Tom");
        email.setReceiver("wesley");
        Attachment attachment = new Attachment();
        attachment.setFileName("原型模式作业");
        attachment.setInfo("这是原型模式作业");
        email.setAttachment(attachment);

        Email copyEmail = (Email)email.clone();

        System.out.println(copyEmail==email);

        System.out.println(copyEmail.getAttachment()==email.getAttachment());
    }

}
