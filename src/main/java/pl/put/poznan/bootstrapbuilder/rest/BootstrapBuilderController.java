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
        if (!bootstrapBuilderInput.getHeaderType().isEmpty()) {
            if (bootstrapBuilderInput.getHeaderType().contentEquals("static"))
                b.withHeader(BootstrapBuilder.HeaderType.STATIC);
            if (bootstrapBuilderInput.getHeaderType().contentEquals("fixed"))
                b.withHeader(BootstrapBuilder.HeaderType.FIXED);
        }
        if (bootstrapBuilderInput.isAddNormalMetaTag()) {
            if (bootstrapBuilderInput.getMetaTagType().contentEquals("normal"))
                b.withMetaTag(BootstrapBuilder.MetaTagType.NORMAL);
            if (bootstrapBuilderInput.getMetaTagType().contentEquals("open_graph"))
                b.withMetaTag(BootstrapBuilder.MetaTagType.OPEN_GRAPH);
            if (bootstrapBuilderInput.getMetaTagType().contentEquals("twitter"))
                b.withMetaTag(BootstrapBuilder.MetaTagType.TWITTER);
        }

        if (!bootstrapBuilderInput.getMetaTagDescription().isEmpty())
            b.withMetaTagDescription(bootstrapBuilderInput.getMetaTagDescription());
        if (!bootstrapBuilderInput.getMetaTagImage().isEmpty())
            b.withMetaTagImage(bootstrapBuilderInput.getMetaTagImage());
        if (!bootstrapBuilderInput.getMetaTagType().isEmpty())
            b.withMetaTagType(bootstrapBuilderInput.getMetaTagType());
        if (!bootstrapBuilderInput.getMetaTagTitle().isEmpty())
            b.withMetaTagTitle(bootstrapBuilderInput.getMetaTagTitle());


        return b.build().toJson();
    }
}


