package br.com.chatbot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informacoes_transmissao")



public class informacoesTransmissao {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "tipo")
	    private String tipo;

	    @Column(name = "relacoes_transmissao")
	    private String relacoesTransmissao;

	    @Column(name = "diferencial")
	    private double diferencial;

	    @Column(name = "tracao")
	    private String tracao;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getRelacoesTransmissao() {
			return relacoesTransmissao;
		}

		public void setRelacoesTransmissao(String relacoesTransmissao) {
			this.relacoesTransmissao = relacoesTransmissao;
		}

		public double getDiferencial() {
			return diferencial;
		}

		public void setDiferencial(double diferencial) {
			this.diferencial = diferencial;
		}

		public String getTracao() {
			return tracao;
		}

		public void setTracao(String tracao) {
			this.tracao = tracao;
		}

	 
	}


