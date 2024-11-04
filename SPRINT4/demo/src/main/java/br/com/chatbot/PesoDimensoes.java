package br.com.chatbot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peso_dimensoes")

public class PesoDimensoes {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "ordem_marcha")
	    private double ordemMarcha;

	    @Column(name = "capacidade_carga")
	    private int capacidadeCarga;

	    @Column(name = "comprimento_veiculo")
	    private double comprimentoVeiculo;

	    @Column(name = "largura_veiculo_sem_espelhos")
	    private double larguraVeiculoSemEspelhos;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getOrdemMarcha() {
			return ordemMarcha;
		}

		public void setOrdemMarcha(double ordemMarcha) {
			this.ordemMarcha = ordemMarcha;
		}

		public int getCapacidadeCarga() {
			return capacidadeCarga;
		}

		public void setCapacidadeCarga(int capacidadeCarga) {
			this.capacidadeCarga = capacidadeCarga;
		}

		public double getComprimentoVeiculo() {
			return comprimentoVeiculo;
		}

		public void setComprimentoVeiculo(double comprimentoVeiculo) {
			this.comprimentoVeiculo = comprimentoVeiculo;
		}

		public double getLarguraVeiculoSemEspelhos() {
			return larguraVeiculoSemEspelhos;
		}

		public void setLarguraVeiculoSemEspelhos(double larguraVeiculoSemEspelhos) {
			this.larguraVeiculoSemEspelhos = larguraVeiculoSemEspelhos;
		}


}
