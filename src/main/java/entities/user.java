package entities;

public class user {

    private String UserName;

    private String Email;

    private String Password;

    public user(String name, String email, String password) {
        UserName = name;
        Email = email;
        Password = password;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        UserName = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
