package org.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/unexpected-exception")
    public String unexpectedException() {
        throw new NullPointerException("This an unexpected exception thrown in the server");
    }

    @GetMapping("/expected-exception")
    public String hello() {
        throw new BadRequestException("This is the user's fault");
    }
}
