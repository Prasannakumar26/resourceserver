package com.resourceserver.springresourceserver.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceServerController {

    @GetMapping("/home")
    public String getData(){
        return "welcome to the resource server";

    }
}
