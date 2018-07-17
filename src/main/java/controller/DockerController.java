package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @RequestMapping("/")
    public String Index(){
        return "Hello docker demo test!";
    }

}
