package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Caja {

	private GestionDeMesa gestionDeMesa;
	private List <Ticket> listadoDeTickets;

	public Caja (GestionDeMesa gestionDeMesa){
		
		this.gestionDeMesa = gestionDeMesa;
		listadoDeTickets = new ArrayList <Ticket> ();

		
	}


	public void generarTicket(int nroMesa){

		Ticket ticket = new Ticket();
		
		ticket.setNumeroDeMesa (nroMesa);
				
		HashMap<Integer,Integer> consumiciones = gestionDeMesa.getMesa(nroMesa).getConsumiciones();
		
		//ticket.agregarItem (consumiciones);//
		
		listadoDeTickets.add (ticket);
		
		ListIterator<Ticket> itr = listadoDeTickets.listIterator();
				
		while (itr.hasNext()){
			
			if (itr.next().equals (ticket)){
				
				System.out.println(ticket);
			}
			
		}
	
	}
	
//
//	private double getMontoTotalAPagar(int nroMesa) {
//
//
//
//		return 0;
//	}
//
//	private List<String> getConsumiciones(int nroMesa) {
//
//
//		return null;
//	}


}
