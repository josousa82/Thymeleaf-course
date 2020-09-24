package com.practice.thymeleafcourse.controlers;

import com.practice.thymeleafcourse.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sousaJ on 23/09/2020
 * in package - com.practice.thymeleafcourse.controlers
 **/
@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/product", "/product.html"})
    public String getProduct(){
        return "redirect:/index";
    }


    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

}
