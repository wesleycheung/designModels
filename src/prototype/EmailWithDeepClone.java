package prototype;

import java.io.*;
import java.util.Date;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */
public class EmailWithDeepClone implements Serializable,Cloneable{
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
            return this.deepClone();
        } catch (Exception e) {
            System.out.println("克隆发生错误");
        }
        return null;
    }
    private Object deepClone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            EmailWithDeepClone copy = (EmailWithDeepClone)ois.readObject();

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
