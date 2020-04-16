public class Inmueble {

	private Integer precio;
	private String direccion;
	private String estado;

	public Inmueble(Integer precio, String direccion, String estado) {
		// TODO Auto-generated constructor stub

		this.precio = precio;
		this.direccion = direccion;
		this.estado = estado;

	}

	
	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
