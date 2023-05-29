package buoi4.halamhung.controller;

import buoi4.halamhung.model.Product;
import buoi4.halamhung.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    //product/view
    @GetMapping("view")
    public String ViewProducts(Model model){
        model.addAttribute("listProducts",productService.getAllProducts());
        return "view_productlist";
    }
    @GetMapping("addnew")
    public String ShowNewProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }
    //product/save
    @PostMapping("save")
    public String saveProduct(@ModelAttribute("product") Product product){
    //SAVE PRODUCT TO DATABASE
        productService.saveProduct(product);
        return "redirect:/product/view";
    }
}
