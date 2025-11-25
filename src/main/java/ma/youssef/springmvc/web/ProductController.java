package ma.youssef.springmvc.web;

import ma.youssef.springmvc.entities.Product;
import ma.youssef.springmvc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    };

    @GetMapping("/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("productsList", products);
        return  "products"; // page products.html
    };

    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    };

    @GetMapping("/newProduct")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "newProduct";
    };
}
