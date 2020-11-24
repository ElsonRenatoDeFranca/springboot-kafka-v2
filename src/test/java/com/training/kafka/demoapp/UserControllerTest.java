package com.training.kafka.demoapp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;

@SpringBootTest
public class UserControllerTest {

    /*@Test
    public void retrieveCartById_shouldReturn200_whenCartIsFound() {

        given().
                pathParam("cartId", "1").
                when().
                get("/carts/{cartId}").
                then().
                statusCode(200);

    }*/
}
