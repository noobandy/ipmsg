package ipmsg;

public class User {
    private String group;
    private String host;
    private String ip;

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public boolean equals(Object o) {
        if(!(o instanceof User)) {
            return false;
        }

        User other = (User) o;

        return ip.equals(other.ip);
    } 
}