import entityprovider.ColorData;
import org.junit.Assert;
import org.junit.Test;
import specifications.Specifications;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

/**
 *  The class get and sorts the list by year and compares the expected result with the actual result
 *
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 */
public class GetListResourceTest extends BaseTest{

    @Test
    public void sortedYearsTest() {
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL), Specifications.responseSpecOK200());
        List<ColorData> colors = given()
                .when()
                .get(GET_LIST_RESOURCE)
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorData.class);
        List<Integer> years = colors.stream().map(ColorData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
    }
}
