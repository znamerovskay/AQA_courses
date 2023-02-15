package entityprovider;

/**
 * Class generates an error body to check for unsuccessfully registration
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class UnSuccessReg {

    private String error;

    public UnSuccessReg(String error) {
        this.error = error;
    }
    public UnSuccessReg(){}

    public String getError() {
        return error;
    }
}
