package com.ctspring.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class HelloApi {

    @GetMapping
    public String merhaba(){
        return "Merhaba Dünya";
    }

}
