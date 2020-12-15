package framework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestCalls {
    public static Response GETCall(String baseURI){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        Response response= requestSpecification.get(baseURI);
        return response;
    }
    public void POSTCall(){
    }
    public void PUTCall(){
    }
    public void DELETECall(){
    }
}
