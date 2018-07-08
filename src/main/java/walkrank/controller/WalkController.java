package walkrank.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import walkrank.model.Input;
import walkrank.model.Output;
import walkrank.service.WalkService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WalkController {
    private static final Logger logger = LogManager.getLogger(WalkController.class);


    @Autowired
    private WalkService service;

    @PostMapping("/hello")
    public Output hello(@RequestBody Input in) {
        logger.info("hello log4j2");
        Output res = service.hello();
        return res;
    }
}

