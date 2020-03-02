package Clases;

import Excepciones.ValorEnBlancoException;
import Excepciones.ListaDeConsumicionesNoVaciaException;
import Excepciones.MesaNoDisponibleException;
import Excepciones.NumeroDeMesaException;

public class GestionDeMesa {

	public Mesa[] mesas;

	public GestionDeMesa(int cantidadDeMesas) throws NumeroDeMesaException{ 
		mesas = new Mesa[cantidadDeMesas];
		for (int i = 0; i < mesas.length; i++) {
			mesas[i].setEstado(EstadoDeMesa.Disponible);
		}
	}

	public void ocuparMesa(int nroMesa)throws MesaNoDisponibleException {

		if (mesas[nroMesa-1].getEstado() == EstadoDeMesa.Disponible) {
			mesas[nroMesa-1].setEstado(EstadoDeMesa.Ocupada);
		}

	}

	public void registrarConsumiciones(int nroMesa, Producto producto, int cantidad)throws ValorEnBlancoException { 
		if(nroMesa == 0 ||producto == null|| cantidad == 0){
		} else {
			int codigoProducto = Producto.codigo;

			if (mesas[nroMesa-1].getEstado() == EstadoDeMesa.Ocupada) {
				//mesas[nroMesa-1].getConsumiciones().add("Producto: " + producto.codigo + " " + "Cantidad: " + cantidad);//
				mesas[nroMesa-1].getConsumiciones().put(codigoProducto,cantidad);

			}
		}
	}

	public void cerrarMesa (int nroMesa)throws MesaNoDisponibleException,ListaDeConsumicionesNoVaciaException{ 

		if (mesas[nroMesa-1].getEstado() == EstadoDeMesa.Disponible){ 
				if (mesas[nroMesa-1].getConsumiciones() == null) {

			mesas[nroMesa-1].setEstado(EstadoDeMesa.Cerrada);
		}
	}
}

	public void disponibilizarMesa (int nroMesa){ //falta excepcion

		if ((mesas[nroMesa-1].getEstado() == EstadoDeMesa.Cerrada)||
				(mesas[nroMesa-1].getEstado() == EstadoDeMesa.Ocupada && 
				mesas[nroMesa-1].getConsumiciones() == null)){

			mesas[nroMesa-1].setEstado(EstadoDeMesa.Disponible);

		}

	}

	public EstadoDeMesa getEstadoDeMesa (int nroMesa){

		return mesas[nroMesa-1].getEstado();
	}

	public Mesa getMesa (int nroMesa){

		return mesas[nroMesa-1];
	}


}
