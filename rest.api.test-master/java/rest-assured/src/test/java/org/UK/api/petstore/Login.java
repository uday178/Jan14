

import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class Login {

    @Test(groups = {"login"}, dependsOnGroups = {"user"})
    public void login() {
        RestAssured.baseURI = "http://petstore.swagger.io/v2";

        given()
                .contentType("application/json")
                .queryParam("sayem")
                .queryParam("passw0rd")
                .expect()
                .statusCode(200)
                .log().all().response()

                .when()
                .get("/user/login").asString();
    }

}
