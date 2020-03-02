package Clases;

public class Pizza extends Producto{

	private double costo;
	private final double porcentajeDeGanancia = 30/100;
	private int stock;

	
	// Constructor de la clase//
	
	public Pizza(String descripcion, double costo, int stock) {
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
