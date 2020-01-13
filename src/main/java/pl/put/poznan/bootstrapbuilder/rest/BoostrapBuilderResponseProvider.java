package pl.put.poznan.bootstrapbuilder.rest;

import java.util.ArrayList;

public class BoostrapBuilderResponseProvider {
    private ArrayList<BootstrapBuilderResponse> responses;

    public BoostrapBuilderResponseProvider() {
        responses = new ArrayList<>();
    }

    public void addResponse(BootstrapBuilderResponse response) {
        responses.add(response);
    }

    public BootstrapBuilderResponse getResponse(String startsWith) {
        for (BootstrapBuilderResponse response : responses) {
            if (response.toJson().startsWith(startsWith)) {
                return response;
            }
        }

        return null;
    }
}
