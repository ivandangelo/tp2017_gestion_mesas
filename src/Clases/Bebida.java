package Clases;

public class Bebida extends Producto{


	public TipoDeBebida tipo;
	public double costo;
	private final double porcentajeGanancia = 30/100;
	public int stock;

	//Constructor de la clase//

	public Bebida(String descripcion,TipoDeBebida tipo, double costo, int stock) {
		super(descripcion);
		this.tipo = tipo;
		this.costo = costo;
		this.stock = stock;
	}


	// Permite obtener el costo de un producto //

	public double consultarCosto(int codigo) {

		return costo;
	}

	// Permite calcular el precio de venta//

	public double calcularPrecioDeVenta(int codigo) {

		return (costo*porcentajeGanancia + costo);
	}


}
