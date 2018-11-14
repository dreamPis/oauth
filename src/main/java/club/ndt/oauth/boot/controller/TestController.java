package club.ndt.oauth.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ndt
 * @create 2018/11/1 16:44
 * @description
 * @modify
 */
@RestController
public class TestController {

    @GetMapping("/other")
    public String test(){
        return "other";
    }

}
