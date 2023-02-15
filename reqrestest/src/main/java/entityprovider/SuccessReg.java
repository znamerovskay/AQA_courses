package entityprovider;

/**
 * Class generates a user body to check for successfully registration
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class SuccessReg extends Register{
    private Integer id;
    private String token;

    public SuccessReg(){}

    public SuccessReg(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
