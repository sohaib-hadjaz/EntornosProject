package reviews.data;

public class Users
{
    private String  login;
    private String password;



    public Users()
    {
        login = "";
        password="";
    }

    public Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }



    @Override
    public String toString() {
        return "Users{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
