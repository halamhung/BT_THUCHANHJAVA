package halamhung.co.baiThucHanhSo2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

        @RequestMapping(value = {"/", "/hello"})
    public String showHello(){
        return "helloworld";
    }

    @GetMapping("/nhapten")
    public String NhapTen(){
        return "nhapten";
    }

    @PostMapping("nhanten")
    public String XuatTen(HttpServletRequest request, ModelMap modelmap) {
        String ten = request.getParameter("name");
        modelmap.addAttribute("NAME", ten);
        return "xuatten";
    }
}
