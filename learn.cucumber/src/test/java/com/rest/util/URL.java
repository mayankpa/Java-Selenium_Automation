package com.rest.util;

public class URL {
    public static final String URL ="https://restcountries.eu/rest/v2/alpha/";

    public static String getEndPoint(){
        return URL;
    }
    public static String getEndPoint(String resources){
        return URL + resources;
    }
}
