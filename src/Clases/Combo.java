package Clases;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Combo extends Producto {

	List<Producto> elementoDelCombo;
	double costo;
	double 	costoDelCombo;
	public int nuevoProd;
	private final double porcentajeDeGanancia = 25/100;
	private final double porcentajeDeDescuento = 1/100;

	public Combo(String descripcion){
		super(descripcion);

		elementoDelCombo = new LinkedList<Producto>();

	}


	public void agregarProducto(Producto nuevoProd){

		elementoDelCombo.add(nuevoProd);

	}


	// Permite calcular el costo del combo//

	public double calcularCosto() {


		ListIterator<Producto> itr = elementoDelCombo.listIterator();

		while(itr.hasNext()){

			Producto siguiente = itr.next();

			if(siguiente != null){

				costo = siguiente.consultarCosto(nuevoProd);
				costoDelCombo += costo ;

			}
		}

		return costoDelCombo ;

	}

	// Permite consultar el costo del combo//

	public double consultarCosto(int codigo) {

		return costoDelCombo;
	}

	// Permite calcular el precio de venta//
	
	public double calcularPrecioDeVenta(int codigo) {

		return (costo + (costoDelCombo*porcentajeDeGanancia)-(costoDelCombo*porcentajeDeDescuento));
	}



}
