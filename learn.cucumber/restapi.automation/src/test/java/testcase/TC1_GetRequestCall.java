package testcase;

import framework.RestCalls;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.URL;

public class TC1_GetRequestCall {

    Response response;

    @Test(dataProvider = "CountryCode")
    public void end2endTest(String countryCode){

        String capital=getCapitalCityByResourceCode(countryCode);
        System.out.println("Get Capital City:"+capital);
        int statusCode=verifyStatusCode();
        System.out.println("Positive Test case :"+ statusCode);
        Assert.assertEquals(statusCode,200);

    }
    public String getCapitalCityByResourceCode(String resource){
        String endPointUri= URL.getEndPoint(resource);
        response = RestCalls.GETCall(endPointUri);
        //response.then().log().all().assertThat().statusCode(200);
        String strResponse= response.getBody().asString();
        System.out.println(strResponse);
        JsonPath jsonPath= new JsonPath(strResponse);
        String countryCode=jsonPath.getString("alpha2Code");
        if(countryCode.equalsIgnoreCase(resource)){
            System.out.println("PASS");
            Assert.assertEquals(countryCode,resource);
        }else{
            System.out.println("FAIL");
            Assert.assertNotEquals(countryCode,resource);
        }
        String capital= jsonPath.getString("capital");
        String lang= jsonPath.getString("languages.nativeName[0]");
        System.out.println(lang);
        return capital;
    }
    public int verifyStatusCode(){
        int statusCode=response.getStatusCode();
        return statusCode;
    }

    @DataProvider(name="CountryCode")
    public Object [][]getData(){
        return new Object[][]{{"CA"},{"IN"}};
    }

}
