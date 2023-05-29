package halamhung7.hutech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/hello")
	public String ShowHello() {
	return "helloworld";
}

@GetMapping("/nhapten")
	public String NhapTen(){
	return "nhapten";
}

@PostMapping("/xuatten")
	public String XuatTen(){
	return "xuatten";
}
}
