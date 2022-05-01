package ar.edu.unlp.info.oo2.practica2_ejercicio3;

import java.time.LocalDate;

public class Archivo extends SystemComponent{
    /**
     	* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
     	* y en la fecha <fecha>.
    */
    public Archivo (String nombre, LocalDate fecha, int tamano) {
    	super(nombre, fecha, tamano);
    }
    
    public Archivo archivoMasNuevo() {
    	return this;
    }
    
    public int tamanoTotalOcupado() {
    	return this.tamano;
    }
    
    public Archivo archivoMasGrande(){
    	return this;
    }
}
