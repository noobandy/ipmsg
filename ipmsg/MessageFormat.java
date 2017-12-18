package ipmsg;

public interface MessageFormat {
    String format(Message msg);
    Message parse(String msg);
}