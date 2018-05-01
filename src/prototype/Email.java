package prototype;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */
public class Email implements Cloneable{

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
            return super.clone();
        } catch (Exception e) {
            System.out.println("克隆发生错误");
        }
        return null;
    }


}
