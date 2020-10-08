package com.chr12bu.dummyjsonserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping("/")
    public String doPost(@RequestBody Object request) {
        System.out.println(request.toString());

        return request.toString();
    }


}
