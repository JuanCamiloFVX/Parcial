
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Inmueble I1 = new Inmueble(450000, "calle 23 # 31A - 12", "Arrendada");
		Inmueble I2 = new Inmueble(60000, "Cr 84 # 34B - 39", "vendida");
		Inmueble I3 = new Inmueble(10400, "calle 45 # 7A - 39", "en espera");
		Inmueble I4 = new Inmueble(6500000, "Cr 35 # 34B-45", "vendida");

		Persona P1 = new Persona("Alvaro", 30, 01, I1);
		Persona P2 = new Persona("Juan", 45, 02, I2);
		Persona p3 = new Persona("Felipe", 56, 03, I3);
		Persona P4 = new Persona("Carlos", 25, 04, I4);

		Dueño D1 = new Dueño("Julian", 001, "Comprado","un mes" , I1);
		Dueño D2 = new Dueño("Julian", 001, "Espera","tres mes" , I2);
		Dueño D3 = new Dueño("Julian", 001, "Arrendado","un año" , I3);
		Dueño D4 = new Dueño("Julian", 001, "Comprado","2 semanas" , I4);

		ArrayList<Persona> clientes = new ArrayList<>();

		clientes.add(P1);
		clientes.add(P2);
		clientes.add(p3);
		clientes.add(P4);

		ArrayList<Dueño> Dueños = new ArrayList<>();

		Dueños.add(D1);
		Dueños.add(D2);
		Dueños.add(D3);
		Dueños.add(D4);

		System.out.println("Registro de clientes: ");

		System.out.println(" ");

		for (Persona c : clientes) {

			System.out.println("Nombre: " + c.getNombre() + " ; " + "Edad: " + c.getEdad() + " ; " + "Identificador: " + c.getIdentificador()
					+ " ; " + "Precios, direccion y estado del Inmueble: " + " ; " + c.getInmueble().getPrecio() + " ; "
					+ c.getInmueble().getDireccion() + " ; " + c.getInmueble().getEstado());

		}

		System.out.println(" ");

		System.out.println("Registro de Dueños: ");

		System.out.println(" ");

		for (Dueño p : Dueños) {

			System.out.println("Nombre: " + p.getNombre() + " ; " + "Identificador: " + p.getIdentificador() + " ; " + "Estado Del Inmueble: "
					+ p.getEstadoInmueble() + " ; " + "Tiempo que lleva trabajando: " + p.getTiempoTrabajo() + " ; "
					+ "Precio y direccion del Inmueble: " + p.getInmueble().getPrecio() + " ; " + p.getInmueble().getDireccion());

		}

	}

}
