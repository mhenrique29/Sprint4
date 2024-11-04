package br.com.chatbot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consumo")


public class Consumo {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "consumo_urbano_gasolina")
	    private double consumoUrbanoGasolina;

	    @Column(name = "consumo_urbano_etanol")
	    private double consumoUrbanoEtanol;

	    @Column(name = "consumo_estrada_gasolina")
	    private double consumoEstradaGasolina;

	    @Column(name = "consumo_estrada_etanol")
	    private double consumoEstradaEtanol;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getConsumoUrbanoGasolina() {
			return consumoUrbanoGasolina;
		}

		public void setConsumoUrbanoGasolina(double consumoUrbanoGasolina) {
			this.consumoUrbanoGasolina = consumoUrbanoGasolina;
		}

		public double getConsumoUrbanoEtanol() {
			return consumoUrbanoEtanol;
		}

		public void setConsumoUrbanoEtanol(double consumoUrbanoEtanol) {
			this.consumoUrbanoEtanol = consumoUrbanoEtanol;
		}

		public double getConsumoEstradaGasolina() {
			return consumoEstradaGasolina;
		}

		public void setConsumoEstradaGasolina(double consumoEstradaGasolina) {
			this.consumoEstradaGasolina = consumoEstradaGasolina;
		}

		public double getConsumoEstradaEtanol() {
			return consumoEstradaEtanol;
		}

		public void setConsumoEstradaEtanol(double consumoEstradaEtanol) {
			this.consumoEstradaEtanol = consumoEstradaEtanol;
		}

	    
	}


