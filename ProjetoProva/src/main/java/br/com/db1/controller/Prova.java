package br.com.db1.controller;

import java.util.Date;

public class Prova {
	private Date dataInicioCorrecao;
	private String pontosFracos;
	private String pontosFortes;
	private String parecer;
	private Byte[] anexo;
	private Date dataFinalCorrecao;
	private Integer prazo;
	
	private TipoAvaliacao especificacao = new TipoAvaliacao();
	

	public Date getDataInicioCorrecao() {
		return dataInicioCorrecao;
	}
	public void setDataInicioCorrecao(Date dataInicioCorrecao) {
		this.dataInicioCorrecao = dataInicioCorrecao;
	}
	public String getPontosFracos() {
		return pontosFracos;
	}
	public void setPontosFracos(String pontosFracos) {
		this.pontosFracos = pontosFracos;
	}
	public String getPontosFortes() {
		return pontosFortes;
	}
	public void setPontosFortes(String pontosFortes) {
		this.pontosFortes = pontosFortes;
	}
	public String getParecer() {
		return parecer;
	}
	public void setParecer(String parecer) {
		this.parecer = parecer;
	}
	public Byte[] getAnexo() {
		return anexo;
	}
	public void setAnexo(Byte[] anexo) {
		this.anexo = anexo;
	}
	public Date getDataFinalCorrecao() {
		return dataFinalCorrecao;
	}
	public void setDataFinalCorrecao(Date dataFinalCorrecao) {
		this.dataFinalCorrecao = dataFinalCorrecao;
	}
	public Integer getPrazo() {
		return prazo;
	}
	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}
	public TipoAvaliacao getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(TipoAvaliacao especificacao) {
		this.especificacao = especificacao;
	}
}
