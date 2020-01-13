package pl.put.poznan.bootstrapbuilder.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BoostrapBuilderResponseProviderTest {
    @Test
    void testWithMock() {
        BoostrapBuilderResponseProvider boostrapBuilderResponseProvider = new BoostrapBuilderResponseProvider();

        BootstrapBuilderResponse response1 = mock(BootstrapBuilderResponse.class);
        BootstrapBuilderResponse response2 = mock(BootstrapBuilderResponse.class);

        boostrapBuilderResponseProvider.addResponse(response1);
        boostrapBuilderResponseProvider.addResponse(response2);

        when(response1.toJson()).thenReturn("test1115");
        when(response2.toJson()).thenReturn("test2115");

        boostrapBuilderResponseProvider.addResponse(response1);
        boostrapBuilderResponseProvider.addResponse(response2);

        assertEquals("test2115", boostrapBuilderResponseProvider.getResponse("test2").toJson());
    }
}
