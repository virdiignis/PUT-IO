package pl.put.poznan.bootstrapbuilder.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BootstrapBuilderResponseTest {
    @Test
    void setAndGetResponseTest() {
        BootstrapBuilderResponse bootstrapBuilderResponse = new BootstrapBuilderResponse(null);

        String response = "TestResponse";

        bootstrapBuilderResponse.setResponse(response);

        assertEquals(response, bootstrapBuilderResponse.getResponse());
    }
}
