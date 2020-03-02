package Clases;

public abstract class Producto {

	public static int codigo;
	public String descripcion;
	public double precioVenta;

	public Producto (String descripcion){
		//falta verificar código//
		
		codigo++;
		this.descripcion = descripcion;
	}
	
	//Permite consultar el costo del producto//
	
	public abstract double consultarCosto(int codigo);
	
	// Permite calcular el precio de venta del producto//

	public abstract double calcularPrecioDeVenta(int codigo);
	
	public int getCodigo (){
		
		return codigo;
	}
	
	public String getDescripcion (){
		
		return this.descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioDeVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	




}
