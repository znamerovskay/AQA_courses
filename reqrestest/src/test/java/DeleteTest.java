import org.junit.Test;
import specifications.Specifications;

import static io.restassured.RestAssured.given;

/**
 * Class that deletes a user
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class DeleteTest extends BaseTest {

    @Test
    public void deleteUserTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.errorResponseUnique(204));
        given()
                .when()
                .delete(DELETE)
                .then().log().all();
    }
}
