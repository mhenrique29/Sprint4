package br.com.chatbot;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sistema_freios")
  
public class SistemasFreios {
	
	public class SistemaFreios {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getComando() {
			return comando;
		}

		public void setComando(String comando) {
			this.comando = comando;
		}

		public String getFreioDianteiro() {
			return freioDianteiro;
		}

		public void setFreioDianteiro(String freioDianteiro) {
			this.freioDianteiro = freioDianteiro;
		}

		public String getFreioTraseiro() {
			return freioTraseiro;
		}

		public void setFreioTraseiro(String freioTraseiro) {
			this.freioTraseiro = freioTraseiro;
		}

		@Column(name = "comando")
	    private String comando;

	    @Column(name = "freio_dianteiro")
	    private String freioDianteiro;

	    @Column(name = "freio_traseiro")
	    private String freioTraseiro;

	    
	}

}
