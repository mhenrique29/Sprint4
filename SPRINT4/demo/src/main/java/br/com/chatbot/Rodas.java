package br.com.chatbot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rodas")

public class Rodas {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "medida")
	    private String medida;

	    @Column(name = "pneus")
	    private String pneus;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMedida() {
			return medida;
		}

		public void setMedida(String medida) {
			this.medida = medida;
		}

		public String getPneus() {
			return pneus;
		}

		public void setPneus(String pneus) {
			this.pneus = pneus;
		}

	  
	}


