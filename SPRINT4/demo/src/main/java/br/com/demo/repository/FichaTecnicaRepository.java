package br.com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chatbot.Carro;



public interface FichaTecnicaRepository extends JpaRepository<Carro, Long>{
	 // Método para buscar carros por modelo
    List<Carro> findByModelo(String modelo);
    
    // Método para buscar carros por ano
    List<Carro> findByAno(int ano);
    
    // Método para buscar carros por cor
    List<Carro> findByCor(String cor);
    
    // Método para buscar carros por tipo de transmissão
    List<Carro> findByTransmissaoTipo(String tipo);
    
    // Método para buscar carros por tipo de combustível do motor
    List<Carro> findByMotorTipoCombustivel(String tipoCombustivel);
    
    // Método para buscar carros por potência do motor
    List<Carro> findByMotorPotenciaGreaterThan(int potencia);

	@SuppressWarnings("unchecked")
	Carro save(Carro carroExistente);

}

