package com.edutecno.woodstaco;

public class EntradaNormal {
	private int precio;
	private int numAsiento;
	private int cliente;
	private String vendedor;
	private boolean uso;
	
	public EntradaNormal(int precio, int numAsiento, int cliente, String vendedor, boolean uso){  //Constructor
		this.precio=precio;
		this.numAsiento=numAsiento;
		this.cliente=cliente; 
		this.vendedor=vendedor;
		this.uso=uso;
	}
	
	public int getPrecio() {
		return precio;
	}
	public boolean isUso() {
		return uso;
	}

	public void setUso(boolean uso) {
		this.uso = uso;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
}

