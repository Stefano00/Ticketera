package com.edutecno.woodstaco;

public class EntradaVip extends EntradaNormal {

	private boolean regalo;
	
	public EntradaVip(int precio, int numAsiento, int cliente, String vendedor, boolean uso) {
		super(precio, numAsiento, cliente, vendedor, uso );
		boolean regalo;
		this.regalo=false;
	}

	public boolean isRegalo() {
		return regalo;
	}

	public void setRegalo(boolean regalo) {
		this.regalo = regalo;
	}
	
	
}
