package practice.senior.User;

public class User {
    private String Username;
    private String password;

    public User(){

    }

    public User(String name, String password){
        this.Username = name;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
