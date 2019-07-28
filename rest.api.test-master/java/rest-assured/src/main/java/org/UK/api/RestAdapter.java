
import com.jayway.restassured.path.json.JsonPath;


public interface RestAdapter {

    JsonPath execute();

    <T> T execute(Class<T> responseClass);
}