package br.com.conecta.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public enum Status implements Serializable {
	
	Cancelado,
	Concluído,
	Ag_Propostas,
	Em_Análise
	
	
}

