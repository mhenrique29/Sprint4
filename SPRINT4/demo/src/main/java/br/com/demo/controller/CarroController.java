package br.com.demo.controller;

import br.com.demo.repository.CarroRepository;
import br.com.chatbot.Carro;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public String listarCarros(Model model) {
        model.addAttribute("carros", carroRepository.findAll());
        return "carros";
    }

    public CarroRepository getCarroRepository() {
        return carroRepository;
    }

    public void setCarroRepository(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @GetMapping("/novo")
    public String novoCarroForm(Model model) {
        model.addAttribute("carro", new Carro(null));  
        return "novo-carro";
    }

    @PostMapping("/salvar")
    public String salvarCarro(@ModelAttribute Carro carro) {
        carroRepository.save(carro);  
        return "redirect:/carros";
    }

    @GetMapping("/deletar/{id}")
    public String deletarCarro(@PathVariable Long id) {
        carroRepository.deleteById(id);
        return "redirect:/carros";
    }
}
