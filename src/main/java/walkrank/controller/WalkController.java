package walkrank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import walkrank.model.Input;
import walkrank.model.Output;
import walkrank.service.WalkService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WalkController {


    @Autowired
    private WalkService service;

    @PostMapping("/hello")
    public Output hello(@RequestBody Input in) {

        System.out.println("hello");
        Output res = service.hello();
        return res;
    }
}

