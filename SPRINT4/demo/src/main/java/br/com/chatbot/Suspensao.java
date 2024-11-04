package br.com.chatbot;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "suspensao")



  public class Suspensao {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "tipo_dianteira")
	    private String tipoDianteira;

	    @Column(name = "tipo_traseira")
	    private String tipoTraseira;

	    @Column(name = "amortecedores")
	    private String amortecedores;

	    @Column(name = "elemento_elastico")
	    private String elementoElastico;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipoDianteira() {
			return tipoDianteira;
		}

		public void setTipoDianteira(String tipoDianteira) {
			this.tipoDianteira = tipoDianteira;
		}

		public String getTipoTraseira() {
			return tipoTraseira;
		}

		public void setTipoTraseira(String tipoTraseira) {
			this.tipoTraseira = tipoTraseira;
		}

		public String getAmortecedores() {
			return amortecedores;
		}

		public void setAmortecedores(String amortecedores) {
			this.amortecedores = amortecedores;
		}

		public String getElementoElastico() {
			return elementoElastico;
		}

		public void setElementoElastico(String elementoElastico) {
			this.elementoElastico = elementoElastico;
		}

	}


