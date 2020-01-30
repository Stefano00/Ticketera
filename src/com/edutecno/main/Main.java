package com.edutecno.main;

import java.util.ArrayList;
import java.util.Date;

import com.edutecno.woodstaco.Clientes;
import com.edutecno.woodstaco.EntradaNormal;
import com.edutecno.woodstaco.Evento;
import com.edutecno.woodstaco.Vendedores;

public class Main {

	public static void main(String[] args) {
		// crear cliente
		// crear evento
		// ArrayList<EntradaNormal> listaEntrada = new ArrayList<EntradaNormal>();
		Date fechacliente1 = new Date(102, 0, 20);
		Date fechacliente2 = new Date(99, 0, 18);
		Date fechacliente3 = new Date(105, 2, 13);
		Date fechavendedor1 = new Date(92, 5, 20);
		Date fechavendedor2 = new Date(87, 4, 11);
		Date fechaevento = new Date(120 - 18, 0, 20);
		Date fechaevento1 = new Date(120, 0, 20);
		Date fechaactual = new Date(120, 0, 20);
		String nombreveneto1 = "Woodstaco";

		// Eventos
		System.out.println(CrearEvento(nombreveneto1, 18));

		// ----------------------------------------------------------------------------------
		// Entrada1-----------------------------------------------------------------------------------
		EntradaNormal entrada1 = new EntradaNormal(18500, 25, 1, "Juan Sanchez", false);

		// -------------------------------------------------------------------------------------------
		// Entrada2-----------------------------------------------------------------------------------
		EntradaNormal entrada2 = new EntradaNormal(18500, 26, 2, "Juan Sanchez", false);

		// -------------------------------------------------------------------------------------------
		// Entrada3-----------------------------------------------------------------------------------
		EntradaNormal entrada3 = new EntradaNormal(18500, 27, 3, "Juan Sanchez", true);

		// -------------------------------------------------------------------------------------------

		// Cliente
		// 1-------------------------------------------------------------------------------
		Clientes cliente1 = new Clientes("David Marín", fechacliente1, "17.953.245-k");
		if (fechaevento.compareTo(fechacliente1) >= 0) { // mayor que 18 años segun fecha de evento
			System.out.println("cliente 1 mayor de edad");
		} else {
			System.out.println("cliente 1 menor de edad");
		}

		System.out.println("La edad del cliente 1 es: " + EdadClientes(fechaactual, fechacliente1));
		if (EdadClientes(fechaactual, fechacliente1) >= 18) {
			System.out.println("Puede comprar entrada");
			if (entrada1.isUso() == UsoEntradas(entrada1.isUso())) {
				System.out.println("Entrada encontrada, puede pasar");
			} else {
				System.out.println("Entrada usada, no puede pasar");
			}
		} else {
			System.out.println("No puede comprar entrada");
		}

		System.out.println("------------------------------------------------");

		// Cliente
		// 2-------------------------------------------------------------------------------
		Clientes cliente2 = new Clientes("Mayte Marín", fechacliente2, "17.850.155-1");
		if (fechaevento.compareTo(fechacliente2) >= 0) { // mayor que 18 años segun fecha de evento
			System.out.println("cliente 2 mayor de edad");
		} else {
			System.out.println("cliente 2 menor de edad");
		}
		System.out.println("La edad del cliente 2 es: " + EdadClientes(fechaactual, fechacliente2));

		if (EdadClientes(fechaactual, fechacliente2) >= 18) {
			System.out.println("Puede comprar entrada");
			if (entrada2.isUso() == UsoEntradas(entrada2.isUso())) {
				System.out.println("Entrada encontrada, puede pasar");
			} else {
				System.out.println("Entrada usada, no puede pasar");
			}
		} else {
			System.out.println("No puede comprar entrada");
		}

		System.out.println("------------------------------------------------");

		// Cliente 3
		// ----------------------------------------------------------------------------
		Clientes cliente3 = new Clientes("Ester Quintana", fechacliente3, "15.354.284-5");
		if (fechaevento.compareTo(fechacliente3) >= 0) { // mayor que 18 años segun fecha de evento
			System.out.println("cliente 3 mayor de edad");
		} else {
			System.out.println("cliente 3 menor de edad");
		}
		System.out.println("La edad del cliente 3 es: " + EdadClientes(fechaactual, fechacliente3));
		if (EdadClientes(fechaactual, fechacliente3) >= 18) {
			System.out.println("Puede comprar entrada");
			if (entrada3.isUso() == UsoEntradas(entrada1.isUso())) {
				System.out.println("Entrada encontrada, puede pasar");
			} else {
				System.out.println("Entrada usada, no puede pasar");
			}
		} else {
			System.out.println("No puede comprar entrada");
		}

		System.out.println("------------------------------------------------");

		// vendedores----------------------------------------------------------------------------------
		Vendedores vendedor1 = new Vendedores("Juan Sanchez", fechavendedor1, "17.953.245-k");
		vendedor1.setCantEntradasVendidas(3);
		vendedor1.setCantEntradasVendidasvip(0);
		int entradasven1 = vendedor1.getCantEntradasVendidas();
		System.out.println("El vendedor " + vendedor1.getNombre() + " ha vendido " + entradasven1 + " entradas");
		System.out.println("Cantidad de entradas normales " + entradasven1);
		System.out.println("Cantidad de entradas VIP " + 0);

		System.out.println("------------------------------------------------");

		System.out.println(CrearEvento(nombreveneto1, 18));
		System.out.println("Vendiendo entrada a cliente " + cliente1.getNombre() + " " + cliente1.getRut()
				+ " para evento " + nombreveneto1);
		System.out.println("Vendiendo entrada a cliente " + cliente2.getNombre() + " " + cliente2.getRut()
				+ " para evento " + nombreveneto1);
		System.out.println("Vendiendo entrada a cliente " + cliente3.getNombre() + " " + cliente3.getRut()
				+ " para evento " + nombreveneto1);
		if (fechaevento1.compareTo(fechaactual) != 0) { // se simulará para que la fecha no pueda ingresar
		} else {
			System.out.println("Usando entrada con cliente " + cliente1.getNombre() + " " + cliente1.getRut()
					+ " para evento " + nombreveneto1 + "No se puede usar la entrada porque el evento " + nombreveneto1
					+ " no está en curso.");
		}
		if (fechaevento1.compareTo(fechaactual) == 0) { // se simulará para que la fecha pueda ingresar
			System.out.println(
					"Usando entrada con cliente " + cliente2.getNombre() + " " + cliente2.getRut() + " para evento "
							+ nombreveneto1 + " Entrada encontrada " + cliente2.getNombre() + " puede pasar.");

			System.out.println("Usando entrada con cliente " + cliente3.getNombre() + " " + cliente3.getRut()
					+ " para evento " + nombreveneto1 + " Entrada para rut " + cliente3.getRut()
					+ " ya fue usada, no puede pasar.");
		}
		if (fechaevento1.compareTo(fechaactual) == 0) { // se simulará para que la fecha no pueda ingresar
			System.out.println("El evento " + nombreveneto1 + " se ha cambiado: EnCurso.");
		}

		System.out
				.println("El vendedor " + vendedor1.getNombre() + " ha vendido: " + vendedor1.getCantEntradasVendidas()
						+ " entrada/s normal/es " + vendedor1.getCantEntradasVendidasvip() + " entrada/s VIP");

	}

	// Método edad cliente
	private static int EdadClientes(Date fechaactual, Date fechacliente) {
		// edad de cliente

		int edadcliente = (fechaactual.getYear()) - fechacliente.getYear();
		if (edadcliente == 18) {
			edadcliente = (fechaactual.getMonth()) - fechacliente.getMonth();
			if (edadcliente >= 0) {
				edadcliente = (fechaactual.getDay()) - fechacliente.getDay();
				if (edadcliente >= 0) {
					edadcliente = 18;
				} else {
					edadcliente = 17;
				}
			} else {
				edadcliente = 17;
			}
		}
		return (edadcliente);
	}

	private static String CrearEvento(String nombreEvento, int edadMinima) {
		ArrayList<EntradaNormal> listaEntrada = new ArrayList<EntradaNormal>();
		Evento evento1 = new Evento(nombreEvento, edadMinima, listaEntrada); // crear evento 1
		return ("Creando evento " + evento1.getNombre() + " Edad minima: " + evento1.getEdadMinimaIngreso());
	}
	
	private static boolean UsoEntradas(boolean uso) {
		boolean usoticket=false;
		if(uso==false) {
			usoticket=true;	
			return usoticket;
		}
		else {
			return usoticket;
		}
		
		
	}

}
