package br.com.db1.controller;

import java.util.ArrayList;
import java.util.List;

public class TipoAvaliacao {

	private Integer prazoPadrao;
	private String descricao;
	
	public TipoAvaliacao() {
		
	}
	
	private List<Criterios> criterios = new ArrayList<Criterios>();

	public Integer getPrazoPadrao() {
		return prazoPadrao;
	}

	public void setPrazoPadrao(Integer prazoPadrao) {
		this.prazoPadrao = prazoPadrao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Criterios> getCriterios() {
		return criterios;
	}

	public void setCriterios(List<Criterios> criterios) {
		this.criterios = criterios;
	}
	
	
}
