import entityprovider.Register;
import entityprovider.UnSuccessReg;
import org.junit.Assert;
import org.junit.Test;
import specifications.Specifications;

import static io.restassured.RestAssured.given;

/**
 *  Class checks for unsuccessful user registration
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class PostRegUnsuccessfulTest extends BaseTest{

    @Test
    public void unSuccessRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.errorResponse400());
        Register user = new Register("sydney@fife", "");
        UnSuccessReg unSuccessReg = given()
                .body(user)
                .post( POST_REGISTER_UNSUCCESSFUL)
                .then().log().all()
                .extract().as(UnSuccessReg.class);
        Assert.assertEquals("Missing password", unSuccessReg.getError());
    }
}
