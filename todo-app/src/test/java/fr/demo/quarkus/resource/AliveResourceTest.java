package fr.demo.quarkus.resource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AliveResourceTest {

	@Test
	public void testHelloEndpoint() {
		given()
				.when().get("/alive")
				.then()
				.statusCode(200)
				.body(startsWith("Status : OK"));
	}

}