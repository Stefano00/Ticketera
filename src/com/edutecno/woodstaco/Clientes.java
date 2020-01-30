package com.edutecno.woodstaco;
import java.util.Date;

public class Clientes {
	private String nombre;
	private Date fechaNacimiento= new Date();
	private String rut;
	
	public Clientes(String nombre, Date fechaNacimiento, String rut){  //Constructor
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.rut=rut;   
	}
	
	
	public Clientes() {
		super();
		this.nombre="nombre";
		this.fechaNacimiento=fechaNacimiento;
		this.rut=rut;  
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	
	

}
