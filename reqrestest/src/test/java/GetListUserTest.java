import entityprovider.UserData;
import org.junit.Assert;
import org.junit.Test;
import specifications.Specifications;

import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * The class receives the user id and compares if the id matches the avatar. It also checks if the mail ends with "@reqres.in"
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class GetListUserTest extends BaseTest {

    @Test
    public void checkAvatarAndIdTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.responseSpecOK200());
        List<UserData> users = given()
                .when()
                .get( BASE_URL + GET_LIST_USER)
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));

//        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
//        List<String> ids = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());
//        for(int i = 0; i < avatars.size();i++){
//            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
//        }
    }
}
