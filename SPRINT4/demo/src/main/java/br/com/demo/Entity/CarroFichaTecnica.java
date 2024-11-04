package br.com.demo.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ficha_tecnica_carro")



public class CarroFichaTecnica {
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPosicaoMotor() {
		return posicaoMotor;
	}

	public void setPosicaoMotor(String posicaoMotor) {
		this.posicaoMotor = posicaoMotor;
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

	public String getInjecaoCombustivel() {
		return injecaoCombustivel;
	}

	public void setInjecaoCombustivel(String injecaoCombustivel) {
		this.injecaoCombustivel = injecaoCombustivel;
	}

	public String getTipoTransmissao() {
		return tipoTransmissao;
	}

	public void setTipoTransmissao(String tipoTransmissao) {
		this.tipoTransmissao = tipoTransmissao;
	}

	public int getMarchasTransmissao() {
		return marchasTransmissao;
	}

	public void setMarchasTransmissao(int marchasTransmissao) {
		this.marchasTransmissao = marchasTransmissao;
	}

	public String getComandoFreio() {
		return comandoFreio;
	}

	public void setComandoFreio(String comandoFreio) {
		this.comandoFreio = comandoFreio;
	}

	public String getTipoFreioDianteiro() {
		return tipoFreioDianteiro;
	}

	public void setTipoFreioDianteiro(String tipoFreioDianteiro) {
		this.tipoFreioDianteiro = tipoFreioDianteiro;
	}

	public String getTipoFreioTraseiro() {
		return tipoFreioTraseiro;
	}

	public void setTipoFreioTraseiro(String tipoFreioTraseiro) {
		this.tipoFreioTraseiro = tipoFreioTraseiro;
	}

	public String getTipoSuspensaoDianteira() {
		return tipoSuspensaoDianteira;
	}

	public void setTipoSuspensaoDianteira(String tipoSuspensaoDianteira) {
		this.tipoSuspensaoDianteira = tipoSuspensaoDianteira;
	}

	public String getTipoSuspensaoTraseira() {
		return tipoSuspensaoTraseira;
	}

	public void setTipoSuspensaoTraseira(String tipoSuspensaoTraseira) {
		this.tipoSuspensaoTraseira = tipoSuspensaoTraseira;
	}

	public String getTipoDirecao() {
		return tipoDirecao;
	}

	public void setTipoDirecao(String tipoDirecao) {
		this.tipoDirecao = tipoDirecao;
	}

	public double getDiametroMinimoGiro() {
		return diametroMinimoGiro;
	}

	public void setDiametroMinimoGiro(double diametroMinimoGiro) {
		this.diametroMinimoGiro = diametroMinimoGiro;
	}

	public String getTamanhoRoda() {
		return tamanhoRoda;
	}

	public void setTamanhoRoda(String tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}

	public String getTamanhoPneu() {
		return tamanhoPneu;
	}

	public void setTamanhoPneu(String tamanhoPneu) {
		this.tamanhoPneu = tamanhoPneu;
	}

	public double getPesoVeiculo() {
		return pesoVeiculo;
	}

	public void setPesoVeiculo(double pesoVeiculo) {
		this.pesoVeiculo = pesoVeiculo;
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

	public double getLarguraVeiculo() {
		return larguraVeiculo;
	}

	public void setLarguraVeiculo(double larguraVeiculo) {
		this.larguraVeiculo = larguraVeiculo;
	}

	public double getAlturaVeiculo() {
		return alturaVeiculo;
	}

	public void setAlturaVeiculo(double alturaVeiculo) {
		this.alturaVeiculo = alturaVeiculo;
	}

	public double getEntreEixos() {
		return entreEixos;
	}

	public void setEntreEixos(double entreEixos) {
		this.entreEixos = entreEixos;
	}

	public double getBitolaDianteira() {
		return bitolaDianteira;
	}

	public void setBitolaDianteira(double bitolaDianteira) {
		this.bitolaDianteira = bitolaDianteira;
	}

	public double getBitolaTraseira() {
		return bitolaTraseira;
	}

	public void setBitolaTraseira(double bitolaTraseira) {
		this.bitolaTraseira = bitolaTraseira;
	}

	public int getAnguloEntrada() {
		return anguloEntrada;
	}

	public void setAnguloEntrada(int anguloEntrada) {
		this.anguloEntrada = anguloEntrada;
	}

	public int getAnguloSaida() {
		return anguloSaida;
	}

	public void setAnguloSaida(int anguloSaida) {
		this.anguloSaida = anguloSaida;
	}

	public double getAlturaLivreEixos() {
		return alturaLivreEixos;
	}

	public void setAlturaLivreEixos(double alturaLivreEixos) {
		this.alturaLivreEixos = alturaLivreEixos;
	}

	public double getMinimaAlturaSolo() {
		return minimaAlturaSolo;
	}

	public void setMinimaAlturaSolo(double minimaAlturaSolo) {
		this.minimaAlturaSolo = minimaAlturaSolo;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
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

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "modelo")
	    private String modelo;

	    @Column(name = "posicao_motor")
	    private String posicaoMotor;

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

	    @Column(name = "injecao_combustivel")
	    private String injecaoCombustivel;

	    @Column(name = "tipo_transmissao")
	    private String tipoTransmissao;

	    @Column(name = "marchas_transmissao")
	    private int marchasTransmissao;

	    @Column(name = "comando_freio")
	    private String comandoFreio;

	    @Column(name = "tipo_freio_dianteiro")
	    private String tipoFreioDianteiro;

	    @Column(name = "tipo_freio_traseiro")
	    private String tipoFreioTraseiro;

	    @Column(name = "tipo_suspensao_dianteira")
	    private String tipoSuspensaoDianteira;

	    @Column(name = "tipo_suspensao_traseira")
	    private String tipoSuspensaoTraseira;

	    @Column(name = "tipo_direcao")
	    private String tipoDirecao;

	    @Column(name = "diametro_minimo_giro")
	    private double diametroMinimoGiro;

	    @Column(name = "tamanho_roda")
	    private String tamanhoRoda;

	    @Column(name = "tamanho_pneu")
	    private String tamanhoPneu;

	    @Column(name = "peso_veiculo")
	    private double pesoVeiculo;

	    @Column(name = "capacidade_carga")
	    private int capacidadeCarga;

	    @Column(name = "comprimento_veiculo")
	    private double comprimentoVeiculo;

	    @Column(name = "largura_veiculo")
	    private double larguraVeiculo;

	    @Column(name = "altura_veiculo")
	    private double alturaVeiculo;

	    @Column(name = "entre_eixos")
	    private double entreEixos;

	    @Column(name = "bitola_dianteira")
	    private double bitolaDianteira;

	    @Column(name = "bitola_traseira")
	    private double bitolaTraseira;

	    @Column(name = "angulo_entrada")
	    private int anguloEntrada;

	    @Column(name = "angulo_saida")
	    private int anguloSaida;

	    @Column(name = "altura_livre_eixos")
	    private double alturaLivreEixos;

	    @Column(name = "minima_altura_solo")
	    private double minimaAlturaSolo;

	    @Column(name = "capacidade_tanque_combustivel")
	    private int capacidadeTanqueCombustivel;

	    @Column(name = "velocidade_maxima_etanol")
	    private int velocidadeMaximaEtanol;

	    @Column(name = "velocidade_maxima_gasolina")
	    private int velocidadeMaximaGasolina;

	    @Column(name = "aceleracao_etanol")
	    private double aceleracaoEtanol;

	    @Column(name = "aceleracao_gasolina")
	    private double aceleracaoGasolina;

	    @Column(name = "consumo_urbano_gasolina")
	    private double consumoUrbanoGasolina;

	    @Column(name = "consumo_urbano_etanol")
	    private double consumoUrbanoEtanol;

	    @Column(name = "consumo_estrada_gasolina")
	    private double consumoEstradaGasolina;

	    @Column(name = "consumo_estrada_etanol")
	    private double consumoEstradaEtanol;

	    
	}


