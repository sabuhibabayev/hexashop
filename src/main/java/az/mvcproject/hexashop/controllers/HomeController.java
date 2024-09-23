package az.mvcproject.hexashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    public String index(){
        return "index.html";
    }
  @GetMapping("about")
    public String about(){
        return "about.html";
    }

    @GetMapping("contact")
    public String contact(){
        return "contact.html";
    }

    @GetMapping("products")
    public String products(){
        return "products.html";
    }
    @GetMapping("single-product")
    public String singleProduct(){
        return "single-product.html";
    }
}
