package com.gopiEx.SpringBootWebCrypto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String Home(){
        return "outerpage.html";
    }
}
