package br.com.coldigogeladeiras.modelo;

import java.io.Serializable;

public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String categoria;
	private int marcaId;
	private String modelo;
	private int capacidade;
	private float valor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getmarcaId() {
		return marcaId;
	}
	public void setmarcaId(int marcaId) {
		this.marcaId = marcaId;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public int getcapacidade() {
		return capacidade;
	}
	public void setcapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public float getvalor() {
		return valor;
	}
	public void setvalor(float valor) {
		this.valor = valor;
	}
}
