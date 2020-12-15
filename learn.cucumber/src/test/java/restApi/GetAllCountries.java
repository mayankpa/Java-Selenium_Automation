package restApi;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetAllCountries {

    @Test
    public void  getAllCountriesData(){
        baseURI="https://restcountries.eu/rest/v2/";
        given().log().all().when().log().all().get("all").then().log().all().assertThat().statusCode(200);
    }

    @Test
    public void getAllCountriesDataByName(){
        baseURI="https://restcountries.eu/rest/v2/name/";
        given().log().all().when().log().all().get("Canada").then().log().all().assertThat().statusCode(200);

    }
    @Test
    public void getAllCountriesDataByCode(){
        baseURI="https://restcountries.eu/rest/v2/alpha/";
        given().log().all().when().log().all().get("CA").then().log().all().assertThat().statusCode(200);

    }
}
