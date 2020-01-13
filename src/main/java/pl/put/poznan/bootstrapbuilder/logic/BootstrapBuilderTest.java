package pl.put.poznan.bootstrapbuilder.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BootstrapBuilderTest {
    @Test
    void withFooter() {
    }

    @Test
    void withContactDetails() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withContactDetails();
    }


    @Test
    void withMetaTagTitle() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withMetaTagTitle("title");
    }


    @Test
    void withMetaTagDescription() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withMetaTagDescription("test");
    }

    @Test
    void withMetaTagImage() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withMetaTagImage("test");
    }

    @Test
    void withContactCompanyName() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withContactCompanyName("test");
    }

    @Test
    void withContactInformation() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withContactInformation("test");
    }

    @Test
    void withContactAddress() {
        BootstrapBuilder b = new BootstrapBuilder();
        b.withContactAddress("test");
    }
}