package br.com.chatbot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informacoes_motor")


public class informacoesMotor {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "posicao")
	    private String posicao;

	    @Column(name = "numero_cilindros")
	    private int numeroCilindros;

	    @Column(name = "diametro_curso")
	    private String diametroCurso;

	    @Column(name = "cilindrada_total")
	    private double cilindradaTotal;

	    @Column(name = "taxa_compressao")
	    private double taxaCompressao;

	    @Column(name = "potencia_maxima_gasolina")
	    private int potenciaMaximaGasolina;

	    @Column(name = "potencia_maxima_etanol")
	    private int potenciaMaximaEtanol;

	    @Column(name = "torque_maximo")
	    private int torqueMaximo;

	    @Column(name = "valvulas_por_cilindro")
	    private int valvulasPorCilindro;

	    @Column(name = "ignicao")
	    private String ignicao;

	    @Column(name = "injecao_eletronica")
	    private String injecaoEletronica;

	    @Column(name = "combustivel")
	    private String combustivel;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPosicao() {
			return posicao;
		}

		public void setPosicao(String posicao) {
			this.posicao = posicao;
		}

		public int getNumeroCilindros() {
			return numeroCilindros;
		}

		public void setNumeroCilindros(int numeroCilindros) {
			this.numeroCilindros = numeroCilindros;
		}

		public String getDiametroCurso() {
			return diametroCurso;
		}

		public void setDiametroCurso(String diametroCurso) {
			this.diametroCurso = diametroCurso;
		}

		public double getCilindradaTotal() {
			return cilindradaTotal;
		}

		public void setCilindradaTotal(double cilindradaTotal) {
			this.cilindradaTotal = cilindradaTotal;
		}

		public double getTaxaCompressao() {
			return taxaCompressao;
		}

		public void setTaxaCompressao(double taxaCompressao) {
			this.taxaCompressao = taxaCompressao;
		}

		public int getPotenciaMaximaGasolina() {
			return potenciaMaximaGasolina;
		}

		public void setPotenciaMaximaGasolina(int potenciaMaximaGasolina) {
			this.potenciaMaximaGasolina = potenciaMaximaGasolina;
		}

		public int getPotenciaMaximaEtanol() {
			return potenciaMaximaEtanol;
		}

		public void setPotenciaMaximaEtanol(int potenciaMaximaEtanol) {
			this.potenciaMaximaEtanol = potenciaMaximaEtanol;
		}

		public int getTorqueMaximo() {
			return torqueMaximo;
		}

		public void setTorqueMaximo(int torqueMaximo) {
			this.torqueMaximo = torqueMaximo;
		}

		public int getValvulasPorCilindro() {
			return valvulasPorCilindro;
		}

		public void setValvulasPorCilindro(int valvulasPorCilindro) {
			this.valvulasPorCilindro = valvulasPorCilindro;
		}

		public String getIgnicao() {
			return ignicao;
		}

		public void setIgnicao(String ignicao) {
			this.ignicao = ignicao;
		}

		public String getInjecaoEletronica() {
			return injecaoEletronica;
		}

		public void setInjecaoEletronica(String injecaoEletronica) {
			this.injecaoEletronica = injecaoEletronica;
		}

		public String getCombustivel() {
			return combustivel;
		}

		public void setCombustivel(String combustivel) {
			this.combustivel = combustivel;
		}

	    
	}


