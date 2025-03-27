package org.example;
import com.github.tomakehurst.wiremock.WireMockServer;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class Temp {
    public static void main(String[] args) {


        // Define the base URL for the mock server
        String HOST = "http://localhost:8080";
//        String HOST = "https://reqres.in:8080"; // Alternative URL for an external API


        // Initialize WireMock server on port 8080
        WireMockServer wireMockServer = new WireMockServer(8080);


        try {
            // Start the WireMock server
            wireMockServer.start();


            // Define a stub for a GET request to /api/users/1, returning a mocked JSON response
            wireMockServer.stubFor(get("/api/users/1")
                    .willReturn(aResponse().withBody("{\"message\": \"Hello from WireMock\"}")));


            // Set up RestAssured with the base URI for the mock server
            RequestSpecification baseURL = RestAssured.given().baseUri(HOST);


            // Send a GET request to /api/users/1 and store the response
            Response response = baseURL.get("/api/users/1");


            // Print the response body to the console
            response.getBody().print();


        } finally {
            // Ensure the WireMock server is stopped after the test completes
            wireMockServer.stop();
        }


    }

}
