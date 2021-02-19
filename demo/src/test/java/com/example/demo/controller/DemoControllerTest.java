package com.example.demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    @Test
    public void test() {
        given()
        .when()
            .get("http://localhost:9080/demo/test")
        .then()
            .statusCode(200)
        .body(CoreMatchers.containsString("TEST-1"));
    }
}