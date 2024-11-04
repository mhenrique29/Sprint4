package br.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.AzureAIService;

@RestController
@RequestMapping("/api/ia")

public class IAController {
	 
	
@Autowired
  private AzureAIService azureAIService;

 @PostMapping("/analisar")
  public ResponseEntity<String> analisarSentimento(@RequestBody String texto) {
	        String sentimento = azureAIService.analisarSentimento(texto);
	        return ResponseEntity.ok(sentimento);
	    }
}
