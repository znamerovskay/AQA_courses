package entityprovider;

/**
 * The class creates a body to receive the time
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class UserTimeResponse extends UserTime{

    private String updatedAt;

    public UserTimeResponse(String name, String job, String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }

    public UserTimeResponse() {
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
