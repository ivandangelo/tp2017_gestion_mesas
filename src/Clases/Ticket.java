package Clases;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Ticket {
	
	private static int numero;
	private Date fecha;
	private int numeroDeMesa;
	private List <String> items;
	private Mesa mesa;
	
	public Ticket (){
		
		numero++;
		fecha = new Date();
		numeroDeMesa = 0;
		items = new ArrayList <String>();
	}

	public static int getNumero() {
		return numero;
	}


	public Date getFecha() {
		return fecha;
	}


	public int getNumeroDeMesa() {
		return numeroDeMesa;
	}

	public void setNumeroDeMesa(int numeroDeMesa) {
		this.numeroDeMesa = numeroDeMesa;
	}
	
	public double calcularMontoTotal(int nroMesa){
		
		double montoTotal = 0;
		
		return 0;
	}
//	public void agregarItem (List<Producto> producto){
//		
//		items.add (producto);
//		
//		
//		
//	}
	
	
	

}
