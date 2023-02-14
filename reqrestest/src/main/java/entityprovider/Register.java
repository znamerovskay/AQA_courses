package entityprovider;


/**
 * Class generates a user body to check for registration
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class Register {
    private String email;
    private String password;

    public Register(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Register(){}

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
