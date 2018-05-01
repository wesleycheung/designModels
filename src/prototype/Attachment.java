package prototype;

import java.io.Serializable;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description: this is an attachment of email
 */
public class Attachment implements Serializable{

    private String fileName;

    private String info;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
