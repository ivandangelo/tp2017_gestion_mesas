package Clases;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Mesa {

	public EstadoDeMesa estado;
	public int numeroDeMesa;
	//private List<String> consumiciones;//
	private HashMap<Integer,Integer> consumiciones;

	public Mesa(int numeroDeMesa, EstadoDeMesa estado) {

		this.numeroDeMesa = numeroDeMesa;
		this.estado = estado;
		consumiciones = new HashMap<Integer,Integer>();

	}

	public EstadoDeMesa getEstado() {

		return estado;
	}

	public void setEstado(EstadoDeMesa estado) {

		this.estado = estado;

	}

	//	public List<String> getConsumiciones() {
	//		return consumiciones;
	//	}
	public HashMap<Integer,Integer> getConsumiciones() {
		return consumiciones;
	}
	public int getNumeroDeMesa(int numeroDeMesa){
		return numeroDeMesa;
	}
}
