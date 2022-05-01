package ar.edu.unlp.info.oo2.practica2_ejercicio3;

import java.time.LocalDate;

public abstract class SystemComponent {
	
	protected String nombre;
	protected LocalDate fecha;
	protected int tamano;
	
	protected SystemComponent(String nombre, LocalDate fecha, int tamano) {
		this.fecha = fecha;
    	this.nombre = nombre;
    	this.tamano = tamano;
	}
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract Archivo archivoMasGrande();
	
	public int getTamano() {
		return this.tamano;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public LocalDate getFecha(){
		return this.fecha;
	}
	
	public abstract int tamanoTotalOcupado();

}
