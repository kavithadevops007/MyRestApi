package com.kavitech.rest;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

    private String URL = "http://localhost:8081/employees/";

    @Test
    public void testGetAllEmployees() {
        ValidatableResponse response = when().get(URL).then().statusCode(200);
        System.out.println(response.body("employeeList[0].firstName",equalTo("Kavitha")));
    }
}
