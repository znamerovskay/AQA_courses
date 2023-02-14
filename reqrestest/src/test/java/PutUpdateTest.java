import entityprovider.UserTime;
import entityprovider.UserTimeResponse;
import org.junit.Assert;
import org.junit.Test;
import specifications.Specifications;

import java.time.Clock;

import static io.restassured.RestAssured.given;

/**
 * Class returns response time and request time
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class PutUpdateTest extends BaseTest{

    @Test
    public void timeTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.responseSpecOK200());
        UserTime user = new UserTime("morpheus", "zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put(PUT_UPDATE)
                .then().log().all()
                .extract().as(UserTimeResponse.class);

        String regex = "(.{5})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex, "");
        System.out.println(currentTime);
        Assert.assertEquals(currentTime, response.getUpdatedAt().replaceAll(regex, ""));
        System.out.println(response.getUpdatedAt().replaceAll(regex, ""));
    }
}
