package Prueba;

import static org.junit.Assert.*;

import org.junit.Test;

import Clases.GestionDeMesa;
import Clases.Producto;
import Excepciones.ValorEnBlancoException;
import Excepciones.ListaDeConsumicionesNoVaciaException;
import Excepciones.MesaNoDisponibleException;
import Excepciones.NumeroDeMesaException;

public class GestionDeMesaTest {


	GestionDeMesa gestion;

	//@Test
	//	public void testCrearMesasconNumeroPositivo()throws NumeroDeMesaException {

	//				int actual = gestion.GestionDeMesa(30);
	//
	//
	//			}
	//
	//@Test (expected = NumeroDeMesaException.class)
	//
	//	public void testCrearMesasConNumeroNegativo() throws NumeroDeMesaException {
	//
	//				int actual = gestion.GestionDeMesa(-30);
	//			}
	//
	//@Test (expected = NumeroDeMesaException.class)
	//
	//	public void testCrearMesasConElNumeroCero() throws NumeroDeMesaException {
	//
	//				int actual = gestion.GestionDeMesa(0);
	//			}


	@Test

	public void testOcuparMesaDisponible() throws MesaNoDisponibleException {
		gestion.GestionDeMesa(30);	
		gestion.ocuparMesa(2);
	}


	@Test(expected = MesaNoDisponibleException.class)

	public void testOcuparMesaNoDisponible() throws MesaNoDisponibleException {
		gestion.GestionDeMesa(30);	
		gestion.ocuparMesa(2);
	}
	
	@Test
	public void testRegistrarConsumiciones()throws ValorEnBlancoException {
		gestion.GestionDeMesa(30);	
		gestion.registrarConsumiciones(3, 1, 3);
	}
	
	@Test (expected = ValorEnBlancoException.class)
	
	public void testRegistrarConsumicionesConDatoIncompleto() {
		gestion.GestionDeMesa(30);	
		gestion.registrarConsumiciones(3, 1, 3);
	}

	@Test
	
	public void testCerrarMesa() throws MesaNoDisponibleException, ListaDeConsumicionesNoVaciaException {
		gestion.cerrarMesa(2);
	}

	@Test
	public void testDisponibilizarMesa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEstadoDeMesa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMesa() {
		fail("Not yet implemented");
	}

}
