
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

		Due�o D1 = new Due�o("Julian", 001, "Comprado","un mes" , I1);
		Due�o D2 = new Due�o("Julian", 001, "Espera","tres mes" , I2);
		Due�o D3 = new Due�o("Julian", 001, "Arrendado","un a�o" , I3);
		Due�o D4 = new Due�o("Julian", 001, "Comprado","2 semanas" , I4);

		ArrayList<Persona> clientes = new ArrayList<>();

		clientes.add(P1);
		clientes.add(P2);
		clientes.add(p3);
		clientes.add(P4);

		ArrayList<Due�o> Due�os = new ArrayList<>();

		Due�os.add(D1);
		Due�os.add(D2);
		Due�os.add(D3);
		Due�os.add(D4);

		System.out.println("Registro de clientes: ");

		System.out.println(" ");

		for (Persona c : clientes) {

			System.out.println("Nombre: " + c.getNombre() + " ; " + "Edad: " + c.getEdad() + " ; " + "Identificador: " + c.getIdentificador()
					+ " ; " + "Precios, direccion y estado del Inmueble: " + " ; " + c.getInmueble().getPrecio() + " ; "
					+ c.getInmueble().getDireccion() + " ; " + c.getInmueble().getEstado());

		}

		System.out.println(" ");

		System.out.println("Registro de Due�os: ");

		System.out.println(" ");

		for (Due�o p : Due�os) {

			System.out.println("Nombre: " + p.getNombre() + " ; " + "Identificador: " + p.getIdentificador() + " ; " + "Estado Del Inmueble: "
					+ p.getEstadoInmueble() + " ; " + "Tiempo que lleva trabajando: " + p.getTiempoTrabajo() + " ; "
					+ "Precio y direccion del Inmueble: " + p.getInmueble().getPrecio() + " ; " + p.getInmueble().getDireccion());

		}

	}

}
