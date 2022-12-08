package com.claudio.domain.enums;

public enum Status {

	ABERTO(0, "ABERTO"), 
	ANDAMENTO(1, "ANDAMENTO"),
	FECHADO(2, "FECHADO");
	
	private Integer cod;
	private String descricao;
	
	private Status(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}

	public static Prioridade toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(Prioridade x: Prioridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Status inválido! " + cod);
		//return null;
		
	}
		
}
