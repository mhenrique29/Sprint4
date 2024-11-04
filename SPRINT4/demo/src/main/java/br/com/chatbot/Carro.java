package br.com.chatbot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.demo.Entity.CarroFichaTecnica;
import br.com.service.CarroFichaTecnicaService;


@Component
@Entity
public class Carro {
	
	    private CarroFichaTecnicaService fichaTecnicaService;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String marca;
	    @SuppressWarnings("unused")
		private String modelo;
	    private String fabricante;
	    @SuppressWarnings("unused")
		private int ano;
	    
	   
	    
	    public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setModelo(String modelo) {
		}

		@Autowired
	    
	    public Carro(CarroFichaTecnicaService fichaTecnicaService) {
	        this.fichaTecnicaService = fichaTecnicaService;
	    }

	    public String getResponse(String userInput) {
	        String[] userInputArray = userInput.split("\\s+");
	        String model = userInputArray[userInputArray.length - 1]; 

	        CarroFichaTecnica fichaTecnica = fichaTecnicaService.getCarroFichaTecnicaByModel(model);

	        if (fichaTecnica == null) {
	            return "Desculpe, não foi possível encontrar informações para o modelo especificado.";
	        }

	     
	        if (userInput.contains("motor")) {
	            return "O motor do " + model + " é " + fichaTecnica.getModelo();
	        } else if (userInput.contains("transmissão")) {
	            return "A transmissão do " + model + " é " + fichaTecnica.getTipoTransmissao();
	        } else {
	            return "Desculpe, não entendi. Por favor, pergunte sobre o motor, transmissão ou qualquer outra informação da ficha técnica.";
	        }
	    }

		public Object getModelo() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getAno() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setModelo(Object modelo) {
			// TODO Auto-generated method stub
			
		}

		public void setAno(Object ano) {
			// TODO Auto-generated method stub
			
		}

		public CarroFichaTecnicaService getFichaTecnicaService() {
			return fichaTecnicaService;
		}

		public void setFichaTecnicaService(CarroFichaTecnicaService fichaTecnicaService) {
			this.fichaTecnicaService = fichaTecnicaService;
		}
	}