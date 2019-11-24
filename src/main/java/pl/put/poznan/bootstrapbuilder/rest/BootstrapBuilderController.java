package pl.put.poznan.bootstrapbuilder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
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
        return new BootstrapBuilder()
                .build()
                .toJson();
    }
}


