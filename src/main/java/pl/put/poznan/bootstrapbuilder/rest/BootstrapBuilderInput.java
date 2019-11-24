package pl.put.poznan.bootstrapbuilder.rest;

public class BootstrapBuilderInput {
    private String headerType;
    private boolean addFooter;

    private boolean addNormalMetaTag;
    private boolean addOpenGraphMetaTag;
    private boolean addTwitterMetaTag;

    private String metaTagTitle;
    private String metaTagType;
    private String metaTagDescription;
    private String metaTagImage;

    public String getHeaderType() {
        return headerType;
    }

    public void setHeaderType(String headerType) {
        this.headerType = headerType;
    }

    public boolean isAddFooter() {
        return addFooter;
    }

    public void setAddFooter(boolean addFooter) {
        this.addFooter = addFooter;
    }

    public boolean isAddNormalMetaTag() {
        return addNormalMetaTag;
    }

    public void setAddNormalMetaTag(boolean addNormalMetaTag) {
        this.addNormalMetaTag = addNormalMetaTag;
    }

    public boolean isAddOpenGraphMetaTag() {
        return addOpenGraphMetaTag;
    }

    public void setAddOpenGraphMetaTag(boolean addOpenGraphMetaTag) {
        this.addOpenGraphMetaTag = addOpenGraphMetaTag;
    }

    public boolean isAddTwitterMetaTag() {
        return addTwitterMetaTag;
    }

    public void setAddTwitterMetaTag(boolean addTwitterMetaTag) {
        this.addTwitterMetaTag = addTwitterMetaTag;
    }

    public String getMetaTagTitle() {
        return metaTagTitle;
    }

    public void setMetaTagTitle(String metaTagTitle) {
        this.metaTagTitle = metaTagTitle;
    }

    public String getMetaTagType() {
        return metaTagType;
    }

    public void setMetaTagType(String metaTagType) {
        this.metaTagType = metaTagType;
    }

    public String getMetaTagDescription() {
        return metaTagDescription;
    }

    public void setMetaTagDescription(String metaTagDescription) {
        this.metaTagDescription = metaTagDescription;
    }

    public String getMetaTagImage() {
        return metaTagImage;
    }

    public void setMetaTagImage(String metaTagImage) {
        this.metaTagImage = metaTagImage;
    }
}
