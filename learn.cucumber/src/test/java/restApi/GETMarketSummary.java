package restApi;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class GETMarketSummary {
    @Test
    public void getMarketSummary(){
        RestAssured.baseURI="https://apidojo-yahoo-finance-v1.p.rapidapi.com";
        given().log().all().queryParam("region","US").queryParam("lang","en").header("x-rapidapi-key","def0123691msh2e78cf18b6d7e6dp149783jsn2d9343c42a94")
                .when().log().all().get("/market/get-summary").then().log().all().assertThat().statusCode(200);
    }
}
