import com.tngtech.java.junit.dataprovider.DataProvider;
import entityprovider.Register;
import entityprovider.SuccessReg;
import org.junit.Assert;
import org.junit.Test;
import specifications.Specifications;

import static io.restassured.RestAssured.given;

/**
 *  Class checks for successful user registration
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class PostRegisterSuccessfulTest extends BaseTest {

    @Test
    public void successRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.responseSpecOK200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post(POST_REGISTER_SUCCESSFUL)
                .then().log().all()
                .extract().as(SuccessReg.class);
        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());

        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
    }
}
