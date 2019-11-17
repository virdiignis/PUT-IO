package pl.put.poznan.bootstrapbuilder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/skeleton")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get() {

        return "test";
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post() {

        return "test";
    }



}


