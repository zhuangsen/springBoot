package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by madison on 12/14/2016.
 */


//@Controller @ResponseBody  == RestController
@RestController
@RequestMapping("/hello")
public class HelloController {

/*    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    //content: "cupSize: ${cupSize},age: ${age}"
    @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        //return "Hello Spring Boot!";
        //return content;
        //return girlProperties.getCupSize();
        //return "index";
        return "id:"+myId;
    }
}
