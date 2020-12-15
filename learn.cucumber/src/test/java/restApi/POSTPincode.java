package restApi;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class POSTPincode {
    @Test
    public void postPincode(){
        RestAssured.baseURI="https://apidojo-yahoo-finance-v1.p.rapidapi.com";
        given().log().all().header("X-RapidAPI-Host","pincode.p.rapidapi.com").header("X-RapidAPI-Key","def0123691msh2e78cf18b6d7e6dp149783jsn2d9343c42a94").header("Content-Type","application/json")
                .body("{\n" +
                        "    \"searchBy\": \"pincode\",\n" +
                        "    \"value\":380001\n" +
                        "}").when().log().all().post().then().log().all().assertThat().statusCode(200);
    }
}
