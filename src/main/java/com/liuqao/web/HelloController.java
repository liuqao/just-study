package com.liuqao.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author liuqiao
 * @Date 2020/6/19
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public Map say(){
        Map result = new HashMap();
        result.put("tom","hi" );
        result.put("aim","how are you" );
        result.put("tom","im fine" );
        result.put("tom","thank you" );
        result.put("tom","and you?" );
        return result;
    }
}
