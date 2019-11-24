package pl.put.poznan.bootstrapbuilder.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class BootstrapBuilderResponse {
    private String response;

    public BootstrapBuilderResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String toJson() {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

        try {
            return objectWriter.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
