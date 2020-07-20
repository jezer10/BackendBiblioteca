package upeu.biblioteca.modelo.entity;

public class Lector {
	private String dnilector;
	private String nombre;
	private String telefono;
	private String direccion;
	private String obsrvaciones;

	public Lector() {
		super();
	}

	public Lector(String dnilector, String nombre, String telefono, String direccion, String obsrvaciones) {
		super();
		this.dnilector = dnilector;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.obsrvaciones = obsrvaciones;
	}

	public String getDnilector() {
		return dnilector;
	}

	public void setDnilector(String dnilector) {
		this.dnilector = dnilector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getObsrvaciones() {
		return obsrvaciones;
	}

	public void setObsrvaciones(String obsrvaciones) {
		this.obsrvaciones = obsrvaciones;
	}

}
