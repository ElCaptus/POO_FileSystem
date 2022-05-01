package ar.edu.unlp.info.oo2.practica2_ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends SystemComponent{
	private List<SystemComponent> componentes;
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
    public Directorio(String nombre, LocalDate fecha) {
    	super(nombre, fecha,32);
		this.componentes = new ArrayList<SystemComponent>();
	}

    public void agregar(SystemComponent componente) {
    	componentes.add(componente);
    }
    
 	/**
 	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
    public int tamanoTotalOcupado() {
		return componentes.stream().mapToInt(componente -> componente.tamanoTotalOcupado()).sum()+this.tamano;//+32bytes
	}

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
    public Archivo archivoMasGrande() {
    	Archivo MAX = null;
    	if  (!componentes.isEmpty()){
    		//hacer flat y ordenar
    		MAX = (Archivo) componentes.stream().max( (componente1, componente2) -> componente1.archivoMasGrande().getTamano() - componente2.archivoMasGrande().getTamano()).get();
    	}
    	return MAX;
	}

    /**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	* del filesystem contenido por directorio receptor.
	*/
    public Archivo archivoMasNuevo() {
    	Archivo MAX = null;
    	if  (!componentes.isEmpty()){
    		
    		
    		MAX = (Archivo) componentes.stream().max( 
    				(componente1, componente2) -> 
    				componente1.archivoMasNuevo().getFecha().compareTo(componente2.archivoMasNuevo().getFecha())
    				).get();
    	} //hacer flat y ordenar
		return MAX;
	}
    
}

