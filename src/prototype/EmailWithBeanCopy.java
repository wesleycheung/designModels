package prototype;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */
public class EmailWithBeanCopy implements Cloneable{

    private String from;

    private String receiver;

    private Attachment attachment;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
    @Override
    public Object clone(){
        try {
            return beanCopy();
        } catch (Exception e) {
            System.out.println("克隆发生错误");
        }
        return null;
    }

    private Object beanCopy(){
        EmailWithBeanCopy em= new EmailWithBeanCopy();
        em.setReceiver(this.receiver);
        em.setFrom(this.from);
        Attachment attachment = new Attachment();
        System.out.println(attachment);
        attachment.setInfo(this.getAttachment().getInfo());
        attachment.setFileName(this.getAttachment().getFileName());
        em.setAttachment(attachment);
        return em;
    }
}
