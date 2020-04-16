
public class Persona {

	private String nombre;
	private Integer edad;
	private Integer Identificador;
	private Inmueble Inmueble;

	public Persona(String nombre, Integer edad, Integer Identificador, Inmueble Inmueble) {

		this.Inmueble = Inmueble;
		this.edad = edad;
		this.Identificador = Identificador;
		this.nombre = nombre;

	}

	public Persona(String string, int i, int j, Persona c1) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}

	public Inmueble getInmueble() {
		return Inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		Inmueble = inmueble;
	}

}
