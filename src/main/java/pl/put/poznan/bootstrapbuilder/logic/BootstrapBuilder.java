package pl.put.poznan.bootstrapbuilder.logic;

import pl.put.poznan.bootstrapbuilder.rest.BootstrapBuilderResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BootstrapBuilder {
    public enum HeaderType {
        STATIC, FIXED
    }
    public enum MetaTagType {
        NORMAL, OPEN_GRAPH, TWITTER
    }

    private static final String STATIC_HEADER = "{STATIC_HEADER}";
    private static final String FIXED_HEADER = "{FIXED_HEADER}";
    private static final String FOOTER = "{FOOTER}";
    private static final String FOOTER_CONTACT = "{CONTACT_FOOTER}";
    private static final String META_TAG_NORMAL = "{META_TAG_NORMAL}";
    private static final String META_TAG_OPEN_GRAPH = "{META_TAG_OPEN_GRAPH}";
    private static final String META_TAG_TWITTER = "{META_TAG_TWITTER}";

    private static final String META_TAG_PROPERTY_TITLE = "{META_TAG_TITLE}";
    private static final String META_TAG_PROPERTY_TYPE = "{META_TAG_TYPE}";
    private static final String META_TAG_PROPERTY_DESCRIPTION = "{META_TAG_DESCRIPTION}";
    private static final String META_TAG_PROPERTY_IMAGE = "{META_TAG_IMAGE}";

    private static final String CONTACT_COMPANY_NAME = "{FOOTER_CONTACT_COMPANY_NAME}";
    private static final String CONTACT_INFORMATION = "{FOOTER_CONTACT_INFORMATION}";
    private static final String CONTACT_ADDRESS = "{FOOTER_CONTACT_ADRESS}";
    private static final String CONTACT_EMAIL = "{FOOTER_CONTACT_EMAIL}";
    private static final String CONTACT_TELEPHONE = "{FOOTER_CONTACT_TELEPHONE}";

    private static final Map<String , String> PROPERTIES_MAP = new HashMap<String , String>() {{
        put(STATIC_HEADER, "staticHeader.html");
        put(FIXED_HEADER, "fixedHeader.html");
        put(FOOTER, "footer.html");
        put(FOOTER_CONTACT, "contactFooter.html");
        put(META_TAG_NORMAL, "metaTagNormal.html");
        put(META_TAG_OPEN_GRAPH, "metaTagOpenGraph.html");
        put(META_TAG_TWITTER, "metaTagTwitter.html");
    }};

    private HeaderType headerType;
    private boolean addFooter;
    private boolean addContactDetails;
    private HashSet<MetaTagType> metaTags;

    private String metaTagTitle;
    private String metaTagType;
    private String metaTagDescription;
    private String metaTagImage;

    private String contactCompanyName;
    private String contactInformation;
    private String contactAddress;
    private String contactEmail;
    private String contactTelephone;

    private String readResourceFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(getClass().getResource(fileName).toURI())));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String addPageProperty(String page, String propertyKey, boolean addNotEmpty) {
        if (addNotEmpty) {
            String fileName = "/" + PROPERTIES_MAP.get(propertyKey);

            return page.replace(propertyKey, readResourceFile(fileName));
        } else {
            return page.replace(propertyKey, "");
        }
    }

    public BootstrapBuilder() {
        metaTags = new HashSet<>();

        metaTagTitle = "";
        metaTagType = "";
        metaTagDescription = "";
        metaTagImage = "";
    }

    public BootstrapBuilder withHeader(HeaderType headerType) {
        this.headerType = headerType;
        return this;
    }
    public BootstrapBuilder withFooter() {
        addFooter = true;
        return this;
    }
    public BootstrapBuilder withContactDetails() {
        addContactDetails = true;
        return this;
    }
    public BootstrapBuilder withMetaTag(MetaTagType metaTagType) {
        metaTags.add(metaTagType);
        return this;
    }

    public BootstrapBuilder withMetaTagTitle(String metaTagTitle) {
        this.metaTagTitle = metaTagTitle;
        return this;
    }
    public BootstrapBuilder withMetaTagType(String metaTagType) {
        this.metaTagType = metaTagType;
        return this;
    }
    public BootstrapBuilder withMetaTagDescription(String metaTagDescription) {
        this.metaTagDescription = metaTagDescription;
        return this;
    }
    public BootstrapBuilder withMetaTagImage(String metaTagImage) {
        this.metaTagImage = metaTagImage;
        return this;
    }

    public BootstrapBuilder withContactCompanyName(String contactCompanyName) {
        this.contactCompanyName = contactCompanyName;
        return this;
    }
    public BootstrapBuilder withContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }
    public BootstrapBuilder withContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public BootstrapBuilder withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public BootstrapBuilder withContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
        return this;
    }

    public BootstrapBuilderResponse build(){
        String page = readResourceFile("/bootstrapIndex.html");

        page = addPageProperty(page, STATIC_HEADER, headerType == HeaderType.STATIC);
        page = addPageProperty(page, FIXED_HEADER, headerType == HeaderType.FIXED);

        page = addPageProperty(page, FOOTER, addFooter && !addContactDetails);
        page = addPageProperty(page, FOOTER_CONTACT, addFooter && addContactDetails);

        page = addPageProperty(page, META_TAG_NORMAL, metaTags.contains(MetaTagType.NORMAL));
        page = addPageProperty(page, META_TAG_OPEN_GRAPH, metaTags.contains(MetaTagType.OPEN_GRAPH));
        page = addPageProperty(page, META_TAG_TWITTER, metaTags.contains(MetaTagType.TWITTER));

        page = page.replace(META_TAG_PROPERTY_TITLE, metaTagTitle);
        page = page.replace(META_TAG_PROPERTY_TYPE, metaTagType);
        page = page.replace(META_TAG_PROPERTY_DESCRIPTION, metaTagDescription);
        page = page.replace(META_TAG_PROPERTY_IMAGE, metaTagImage);

        page = page.replace(CONTACT_COMPANY_NAME, contactCompanyName);
        page = page.replace(CONTACT_INFORMATION, contactInformation);
        page = page.replace(CONTACT_ADDRESS, contactAddress);
        page = page.replace(CONTACT_EMAIL, contactEmail);
        page = page.replace(CONTACT_TELEPHONE, contactTelephone);

        return new BootstrapBuilderResponse(page);
    }
}
