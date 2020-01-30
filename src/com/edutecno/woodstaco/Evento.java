package com.edutecno.woodstaco;

import java.util.ArrayList;

public class Evento {
	private String nombre;
	private int edadMinimaIngreso;
	private ArrayList<EntradaNormal> listaEntrada;
	
	public Evento(String nombre, int edadMinimaIngreso, ArrayList<EntradaNormal> listaEntrada){  //Constructor
		this.nombre=nombre;
		this.edadMinimaIngreso=edadMinimaIngreso;
		this.listaEntrada=listaEntrada;   
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadMinimaIngreso() {
		return edadMinimaIngreso;
	}
	public void setEdadMinimaIngreso(int edadMinimaIngreso) {
		this.edadMinimaIngreso = edadMinimaIngreso;
	}
	
	public ArrayList getListaEntrada() {
		return listaEntrada;
	}
	public void setListaEntrada(ArrayList<EntradaNormal> listaEntrada) {
		this.listaEntrada = listaEntrada;
	}
	
	
	

}
