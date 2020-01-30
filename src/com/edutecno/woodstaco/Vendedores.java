package com.edutecno.woodstaco;

import java.util.ArrayList;
import java.util.Date;

public class Vendedores extends Clientes {

	private int cantEntradasVendidas;
	private int cantEntradasVendidasvip;
	
	public Vendedores(String nombre, Date fechaNacimiento, String rut) {
		super(nombre, fechaNacimiento, rut);
		int cantEntradasVendidas;
		int cantEntradasVendidasvip;
		this.cantEntradasVendidas=0;
		this.cantEntradasVendidasvip=0;
		
	}

	public int getCantEntradasVendidasvip() {
		return cantEntradasVendidasvip;
	}

	public void setCantEntradasVendidasvip(int cantEntradasVendidasvip) {
		this.cantEntradasVendidasvip = cantEntradasVendidasvip;
	}

	public int getCantEntradasVendidas() {
		return cantEntradasVendidas;
	}

	public void setCantEntradasVendidas(int cantEntradasVendidas) {
		this.cantEntradasVendidas = cantEntradasVendidas;
	}
	

}
