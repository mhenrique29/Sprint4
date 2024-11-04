package br.com.chatbot;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "desempenho")

public class Desempenho {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "velocidade_maxima_etanol")
	    private int velocidadeMaximaEtanol;

	    @Column(name = "velocidade_maxima_gasolina")
	    private int velocidadeMaximaGasolina;

	    @Column(name = "aceleracao_etanol")
	    private double aceleracaoEtanol;

	    @Column(name = "aceleracao_gasolina")
	    private double aceleracaoGasolina;

	    @Column(name = "zero_a_cem_etanol")
	    private double zeroACemEtanol;

	    @Column(name = "zero_a_cem_gasolina")
	    private double zeroACemGasolina;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getVelocidadeMaximaEtanol() {
			return velocidadeMaximaEtanol;
		}

		public void setVelocidadeMaximaEtanol(int velocidadeMaximaEtanol) {
			this.velocidadeMaximaEtanol = velocidadeMaximaEtanol;
		}

		public int getVelocidadeMaximaGasolina() {
			return velocidadeMaximaGasolina;
		}

		public void setVelocidadeMaximaGasolina(int velocidadeMaximaGasolina) {
			this.velocidadeMaximaGasolina = velocidadeMaximaGasolina;
		}

		public double getAceleracaoEtanol() {
			return aceleracaoEtanol;
		}

		public void setAceleracaoEtanol(double aceleracaoEtanol) {
			this.aceleracaoEtanol = aceleracaoEtanol;
		}

		public double getAceleracaoGasolina() {
			return aceleracaoGasolina;
		}

		public void setAceleracaoGasolina(double aceleracaoGasolina) {
			this.aceleracaoGasolina = aceleracaoGasolina;
		}

		public double getZeroACemEtanol() {
			return zeroACemEtanol;
		}

		public void setZeroACemEtanol(double zeroACemEtanol) {
			this.zeroACemEtanol = zeroACemEtanol;
		}

		public double getZeroACemGasolina() {
			return zeroACemGasolina;
		}

		public void setZeroACemGasolina(double zeroACemGasolina) {
			this.zeroACemGasolina = zeroACemGasolina;
		}

	   
	}


