package com.practice.thymeleafcourse.controlers;

import com.practice.thymeleafcourse.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sousaJ on 23/09/2020
 * in package - com.practice.thymeleafcourse.controlers
 **/
@Controller
public class IndexController {

    private ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products", productService.listProducts());
        return "index";
    }


}
