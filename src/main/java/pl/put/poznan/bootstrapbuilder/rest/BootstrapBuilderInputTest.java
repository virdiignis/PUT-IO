package pl.put.poznan.bootstrapbuilder.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BootstrapBuilderInputTest {

    @org.junit.jupiter.api.Test
    void getHeaderType() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setHeaderType("testvalue1");
        assert bootstrapBuilderInput.getHeaderType().equals("testvalue1");
    }

    @org.junit.jupiter.api.Test
    void setHeaderType() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setHeaderType("testvalue1");
        assert bootstrapBuilderInput.getHeaderType().equals("testvalue1");
    }

    @org.junit.jupiter.api.Test
    void isAddFooter() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddFooter(true);
        assert bootstrapBuilderInput.isAddFooter();
        bootstrapBuilderInput.setAddFooter(false);
        assert !bootstrapBuilderInput.isAddFooter();
    }

    @org.junit.jupiter.api.Test
    void setAddFooter() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddFooter(true);
        assert bootstrapBuilderInput.isAddFooter();
        bootstrapBuilderInput.setAddFooter(false);
        assert !bootstrapBuilderInput.isAddFooter();
    }

    @org.junit.jupiter.api.Test
    void isAddContactDetails() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddContactDetails(true);
        assert bootstrapBuilderInput.isAddContactDetails();
        bootstrapBuilderInput.setAddContactDetails(false);
        assert !bootstrapBuilderInput.isAddContactDetails();
    }

    @Test
    void setAddContactDetails() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddContactDetails(true);
        assert bootstrapBuilderInput.isAddContactDetails();
        bootstrapBuilderInput.setAddContactDetails(false);
        assert !bootstrapBuilderInput.isAddContactDetails();
    }

    @Test
    void setAddNormalMetaTag() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddNormalMetaTag(true);
        assert bootstrapBuilderInput.isAddNormalMetaTag();
        bootstrapBuilderInput.setAddNormalMetaTag(false);
        assert !bootstrapBuilderInput.isAddNormalMetaTag();
    }

    @Test
    void setAddOpenGraphMetaTag() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddOpenGraphMetaTag(true);
        assert bootstrapBuilderInput.isAddOpenGraphMetaTag();
        bootstrapBuilderInput.setAddOpenGraphMetaTag(false);
        assert !bootstrapBuilderInput.isAddOpenGraphMetaTag();
    }

    @Test
    void setAddTwitterMetaTag() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setAddTwitterMetaTag(true);
        assert bootstrapBuilderInput.isAddTwitterMetaTag();
        bootstrapBuilderInput.setAddTwitterMetaTag(false);
        assert !bootstrapBuilderInput.isAddTwitterMetaTag();
    }

    @Test
    void setMetaTagTitle() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setMetaTagTitle("test");
        assert bootstrapBuilderInput.getMetaTagTitle().equals("test");
    }

    @Test
    void setMetaTagType() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setMetaTagType("test");
        assert bootstrapBuilderInput.getMetaTagType().equals("test");
    }

    @Test
    void setMetaTagDescription() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setMetaTagDescription("test");
        assert bootstrapBuilderInput.getMetaTagDescription().equals("test");
    }

    @Test
    void setMetaTagImage() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setMetaTagImage("test");
        assert bootstrapBuilderInput.getMetaTagImage().equals("test");
    }

    @Test
    void setContactCompanyName() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setContactCompanyName("test");
        assert bootstrapBuilderInput.getContactCompanyName().equals("test");
    }

    @Test
    void setContactInformation() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setContactInformation("test");
        assert bootstrapBuilderInput.getContactInformation().equals("test");
    }

    @Test
    void setContactAddress() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setContactAddress("test");
        assert bootstrapBuilderInput.getContactAddress().equals("test");
    }

    @Test
    void setContactEmail() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setContactEmail("test");
        assert bootstrapBuilderInput.getContactEmail().equals("test");
    }

    @Test
    void setContactTelephone() {
        BootstrapBuilderInput bootstrapBuilderInput = new BootstrapBuilderInput();
        bootstrapBuilderInput.setContactTelephone("test");
        assert bootstrapBuilderInput.getContactTelephone().equals("test");
    }
}