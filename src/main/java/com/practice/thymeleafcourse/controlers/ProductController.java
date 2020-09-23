package com.practice.thymeleafcourse.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sousaJ on 23/09/2020
 * in package - com.practice.thymeleafcourse.controlers
 **/
@Controller
public class ProductController {

    @RequestMapping({"/product", "/product.html"})
    public String getProduct(){
        return "product";
    }
}
