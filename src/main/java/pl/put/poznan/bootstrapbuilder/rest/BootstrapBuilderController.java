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

        if ("static".contentEquals(bootstrapBuilderInput.getHeaderType()))
            b.withHeader(BootstrapBuilder.HeaderType.STATIC);
        if ("fixed".contentEquals(bootstrapBuilderInput.getHeaderType()))
            b.withHeader(BootstrapBuilder.HeaderType.FIXED);

        if (bootstrapBuilderInput.isAddNormalMetaTag() || bootstrapBuilderInput.isAddOpenGraphMetaTag() || bootstrapBuilderInput.isAddTwitterMetaTag()) {
            if ("normal".contentEquals(bootstrapBuilderInput.getMetaTagType()))
                b.withMetaTag(BootstrapBuilder.MetaTagType.NORMAL);
            if ("open_graph".contentEquals(bootstrapBuilderInput.getMetaTagType()))
                b.withMetaTag(BootstrapBuilder.MetaTagType.OPEN_GRAPH);
            if ("twitter".contentEquals(bootstrapBuilderInput.getMetaTagType()))
                b.withMetaTag(BootstrapBuilder.MetaTagType.TWITTER);
        }

        if (bootstrapBuilderInput.getMetaTagDescription() != null)
            b.withMetaTagDescription(bootstrapBuilderInput.getMetaTagDescription());
        if (bootstrapBuilderInput.getMetaTagImage() != null)
            b.withMetaTagImage(bootstrapBuilderInput.getMetaTagImage());
        if (bootstrapBuilderInput.getMetaTagType() != null)
            b.withMetaTagType(bootstrapBuilderInput.getMetaTagType());
        if (bootstrapBuilderInput.getMetaTagTitle() != null)
            b.withMetaTagTitle(bootstrapBuilderInput.getMetaTagTitle());


        return b.build().toJson();
    }
}


