package pl.put.poznan.bootstrapbuilder.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.bootstrapbuilder.logic.BootstrapBuilder;


@RestController
@RequestMapping("/skeleton")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get() {
        return new BootstrapBuilder()
                .build()
                .toJson();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@RequestBody BootstrapBuilderInput bootstrapBuilderInput) {
        BootstrapBuilder b = new BootstrapBuilder();

        if (bootstrapBuilderInput.isAddFooter()) b.withFooter();

        if ("static".equals(bootstrapBuilderInput.getHeaderType()))
            b.withHeader(BootstrapBuilder.HeaderType.STATIC);
        if ("fixed".equals(bootstrapBuilderInput.getHeaderType()))
            b.withHeader(BootstrapBuilder.HeaderType.FIXED);

        if (bootstrapBuilderInput.isAddNormalMetaTag()) {
            b.withMetaTag(BootstrapBuilder.MetaTagType.NORMAL);
        }
        if (bootstrapBuilderInput.isAddOpenGraphMetaTag()) {
            b.withMetaTag(BootstrapBuilder.MetaTagType.OPEN_GRAPH);
        }
        if (bootstrapBuilderInput.isAddTwitterMetaTag())
            b.withMetaTag(BootstrapBuilder.MetaTagType.TWITTER);

        if (bootstrapBuilderInput.getMetaTagDescription() != null)
            b.withMetaTagDescription(bootstrapBuilderInput.getMetaTagDescription());
        if (bootstrapBuilderInput.getMetaTagImage() != null)
            b.withMetaTagImage(bootstrapBuilderInput.getMetaTagImage());
        if (bootstrapBuilderInput.getMetaTagType() != null)
            b.withMetaTagType(bootstrapBuilderInput.getMetaTagType());
        if (bootstrapBuilderInput.getMetaTagTitle() != null)
            b.withMetaTagTitle(bootstrapBuilderInput.getMetaTagTitle());

        if (bootstrapBuilderInput.isAddContactDetails()) {
            b.withContactDetails();
            if (bootstrapBuilderInput.getContactAddress() != null)
                b.withContactAddress(bootstrapBuilderInput.getContactAddress());
            if (bootstrapBuilderInput.getContactCompanyName() != null)
                b.withContactCompanyName(bootstrapBuilderInput.getContactCompanyName());
            if (bootstrapBuilderInput.getContactEmail() != null)
                b.withContactEmail(bootstrapBuilderInput.getContactEmail());
            if (bootstrapBuilderInput.getContactInformation() != null)
                b.withContactInformation(bootstrapBuilderInput.getContactInformation());
            if (bootstrapBuilderInput.getContactTelephone() != null)
                b.withContactTelephone(bootstrapBuilderInput.getContactTelephone());
        }

        return b.build().toJson();
    }
}



