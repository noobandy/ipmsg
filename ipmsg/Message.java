package ipmsg;
import java.util.*;

public class Message {
    private User sender;
    private List<User> receivers = new ArrayList<User>();
    private String text;
    private List<Attachment> attachments = new ArrayList<Attachment>();

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }

    public void setReceivers(List<User> receivers) {
        this.receivers = receivers;
    }

    public List<User> getReceivers() {
        return receivers;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAttachements(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }
}