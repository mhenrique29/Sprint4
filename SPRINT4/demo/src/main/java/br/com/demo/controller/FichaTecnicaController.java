package br.com.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.chatbot.Carro;
import br.com.demo.repository.FichaTecnicaRepository;

@RestController
@RequestMapping("/carros")
public class FichaTecnicaController {
	
	@Autowired
	    private FichaTecnicaRepository fichaTecnicaRepository;
		private List<Carro> carros = new ArrayList<>();
	

	    @GetMapping
	    public Iterable<Carro> listarTodosCarros() {
	        return fichaTecnicaRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<?> buscarCarroPorId(@PathVariable long id) {
	        try {
	            Optional<Carro> carro = fichaTecnicaRepository.findById(id);
	            if (carro.isPresent()) {
	                return ResponseEntity.ok(carro);
	            } else {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro não encontrado");
	            }
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar o carro");
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Carro> salvarCarro(@RequestBody Carro carro) {
	        Carro novoCarro = fichaTecnicaRepository.save(carro);
	        return new ResponseEntity<>(novoCarro, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<?> atualizarCarro(@PathVariable Long id, @RequestBody Carro carroAtualizado) {
	    
	    	try {
	    	fichaTecnicaRepository.save(carroAtualizado);
	    	
	    }catch(Exception e) {


	    }
	    	return ResponseEntity.ok("Atualizou");
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> excluirCarro(@PathVariable Long id) {
	        fichaTecnicaRepository.deleteById(id);
	        return ResponseEntity.ok().build();
	    }

		public List<Carro> getCarros() {
			return carros;
		}

		public void setCarros(List<Carro> carros) {
			this.carros = carros;
		}
	}

