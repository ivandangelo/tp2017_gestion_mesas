package Clases;

public class Hamburguesa extends Producto {

	public double costo;
	private final double porcentajeDeGanancia = 25/100;
	public int stock;

	
	// Constructor de la clase//
	
	public Hamburguesa(String descripcion, double costo, int stock) {
		super(descripcion);
		this.costo = costo;
		this.stock = stock;

	}

   // Permite consultar el costo del producto//
	
	public double consultarCosto(int codigo){

		return costo;
	}

	//Permite calcular el precio de venta del producto//
	
	public double calcularPrecioDeVenta(int codigo) {

		return (costo*porcentajeDeGanancia + costo);
	}

}
