package br.com.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	 @GetMapping("/home")
	    public String home(Model model) {
	        model.addAttribute("message", "Bem-vindo à página de suporte Stellantis!");
	        return "home"; // refere-se ao arquivo home.html dentro da pasta templates
	    }
}
