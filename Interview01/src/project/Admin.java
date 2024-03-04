package project;

public class Admin {
    private final String id;//账号
    private final String password;//密码

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
