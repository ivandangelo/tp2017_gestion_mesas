package Clases;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class GestionDePrecios {

	List<Producto>[] productos;

	public GestionDePrecios() {

		productos = new ArrayList[5];

		for (int i = 0; i < productos.length; i++) {

			/*
			 * pos 0: bebidas pos 1: hamburguesas pos 2: pizzas pos 3: minutas
			 * pos 4: combos
			 */

			productos[i] = new ArrayList<Producto>();

		}

	}

	public String consultarDatosDeProducto(int codigoDeProducto) {

		boolean fueEncontrado = false;
		String aux = " ";
		for (int i = 0; i < productos.length && !fueEncontrado; i++) {
			ListIterator<Producto> itr = productos[i].listIterator();
			while (itr.hasNext() && !fueEncontrado) {
				Producto aux2 = itr.next();
				if (aux2.getCodigo() == codigoDeProducto) {

					aux = aux2.getDescripcion();
					fueEncontrado = true;

				}
			}
		}
		return aux;
	}
	
	public void altaDeProducto (Producto producto){
		
		if (producto instanceof Bebida){
			
			productos [0].add (producto);
		}
		
		if (producto instanceof Hamburguesa){
			
			productos [1].add (producto);
		}
		
		if (producto instanceof Pizza){
			
			productos [2].add (producto);
		}
		
		if (producto instanceof Minuta){
			
			productos [3].add (producto);
		}
		
		if (producto instanceof Combo){
			
			productos [4].add (producto);
		}
	}
	
	public void bajaDeProducto (Producto producto){
		
		if (producto instanceof Bebida){
			
			productos [0].remove (producto);
		}
		
		if (producto instanceof Hamburguesa){
			
			productos [1].remove (producto);
		}
		
		if (producto instanceof Pizza){
			
			productos [2].remove (producto);
		}
		
		if (producto instanceof Minuta){
			
			productos [3].remove (producto);
		}
		
		if (producto instanceof Combo){
			
			productos [4].remove (producto);
		}
	}
	
	public void modificarProducto(int codigoDeProducto, double precioDeCosto, String descripcion) {

		boolean fueEncontrado = false;
		for (int i = 0; i < productos.length && !fueEncontrado; i++) {
			ListIterator<Producto> itr = productos[i].listIterator();
			while (itr.hasNext() && !fueEncontrado) {
				Producto aux = itr.next();
				if (aux.getCodigo() == codigoDeProducto) {
					aux.setDescripcion(descripcion);
					aux.setPrecioDeVenta(precioDeCosto);
					fueEncontrado = true;
				}
			}
		}
	}
	
	public void generarCombo (int nroDeProducto, String descripcion){
		
		boolean fueEncontrado = false;
		Producto aux = null;
		
		for (int i = 0; i < productos.length && !fueEncontrado; i++) {
			ListIterator<Producto> itr = productos[i].listIterator();
			while (itr.hasNext() && !fueEncontrado) {
				aux = itr.next();
				if (aux.getCodigo() == nroDeProducto) {
					fueEncontrado = true;

				}
			}
		}
		
		Combo combo = new Combo (descripcion);
		combo.agregarProducto (aux);
		
		
		
	}

}
