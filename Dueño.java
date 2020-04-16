
public class Dueño {

		private String nombre;
		private Integer Identificador;
		private String estadoInmueble; // si la casa esta vendida, arrendada o en espera
		private String tiempoTrabajo; // Tiempo que lleva trabajando con la inmobiliaria
		private Inmueble Inmueble;

		public Dueño(String nombre, Integer Identificador, String estadoInmueble, String tiempoTrabajo, Inmueble Inmueble) {

			this.estadoInmueble = estadoInmueble;
			this.Identificador = Identificador;
			this.nombre = nombre;
			this.tiempoTrabajo = tiempoTrabajo;
			this.Inmueble = Inmueble;

		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Integer getIdentificador() {
			return Identificador;
		}

		public void setIdentificador(Integer identificador) {
			Identificador = identificador;
		}

		

		public String getEstadoInmueble() {
			return estadoInmueble;
		}

		public void setEstadoInmueble(String estadoInmueble) {
			this.estadoInmueble = estadoInmueble;
		}

		public String getTiempoTrabajo() {
			return tiempoTrabajo;
		}

		public void setTiempoTrabajo(String tiempoTrabajo) {
			this.tiempoTrabajo = tiempoTrabajo;
		}

		public Inmueble getInmueble() {
			return Inmueble;
		}

		public void setInmueble(Inmueble inmueble) {
			Inmueble = inmueble;
		}

}

