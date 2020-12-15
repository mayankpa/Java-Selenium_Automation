package restApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; // Todo: This is static package. we need to add manually. using .* can use all the method in that package

public class BasicRestAPITest {
    // TODO: Add place API automation
    // Rest Api work on Given, when and Then
    // Given - accept all inputs - parameters
    // when - submit the api - resources and http method
    // then - validate the response

    public static void main (String[] args){
        RestAssured.baseURI="https://www.rahulshettyacademy.com/";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Peter house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 5000\",\n" +
                "  \"address\": \"1000, Patel Drive, MD-21114\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"English-US\"\n" +
                "}\n").when().log().all().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200);
    }

}
