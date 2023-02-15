
import dataprovider.PostRegSuccessfulProvider;
import entityprovider.*;
import specifications.Specifications;

/**
 * Base test class
 * @author Irina.Znamerovskay
 * @data 10.02.2023
 *
 * All URLs
 */
public abstract class BaseTest {

    Specifications spec = new Specifications();
    BaseEntityProvider baseEntProv = new BaseEntityProvider();
    PostRegSuccessfulProvider provider = new PostRegSuccessfulProvider();

    protected final String BASE_URL = "https://reqres.in/";

    protected final String GET_LIST_USER = "api/users?page=2";
    protected final String POST_REGISTER_SUCCESSFUL = "api/register";
    protected final String POST_REGISTER_UNSUCCESSFUL = "api/register";
    protected final String GET_LIST_RESOURCE = "api/unknown";
    protected final String DELETE = "api/users/2";
    protected final String PUT_UPDATE = "api/users/2";

}
