package Clases;

import Excepciones.NumeroDeMesaException;

public class Sistema {

	public Mesa[] mesas;

	EstadoDeMesa estado;


	public void crearMesas(int cantidadDeMesas)throws NumeroDeMesaException{

		if(cantidadDeMesas> 0){
			mesas = new Mesa[cantidadDeMesas];
			
			
		} 

	}
}