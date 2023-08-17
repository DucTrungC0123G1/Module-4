package com.example.ss4_baitap1.controller;

import com.example.ss4_baitap1.model.Product;
import com.example.ss4_baitap1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public String display(Model model){
        List<Product> productList = productService.display();
        model.addAttribute("product",productList);
        return "/list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "detail";
    }
    @GetMapping("/create")
    public String viewCreate(Model model){
        model.addAttribute("products",new Product());
        return "create";
    }
    @PostMapping("/createProduct")
    public String save( Product products, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("mess","Add Product Success");
        productService.save(products);
        return "redirect:/product";
    }
}