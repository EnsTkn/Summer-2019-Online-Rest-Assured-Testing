package com.automation.tests.day2;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ORDSTests {

    private String baseURI = "http://ec2-18-208-156-147.compute-1.amazonaws.com:1000/ords/hr";

    @Test
    public void test1(){
        Response response = given().get(baseURI+"/employees/");

        System.out.println(response.getBody().asString());

        assertEquals(200,response.getStatusCode());

        System.out.println(response.prettyPrint());
    }

}
