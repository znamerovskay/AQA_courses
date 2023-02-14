package entityprovider;

/**
 * Class creates a user body to get the time
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class UserTime {
    private String name;
    private String job;

    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserTime() {
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
