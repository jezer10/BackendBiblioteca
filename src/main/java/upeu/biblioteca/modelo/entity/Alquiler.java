package upeu.biblioteca.modelo.entity;

public class Alquiler {
	private int idalquiler;
	private String dnilector;
	private String ASIN;
	private String fechasalida;
	private String fechaentrada;

	public Alquiler() {
		super();
	}

	public Alquiler(int idalquiler, String dnilector, String aSIN, String fechasalida, String fechaentrada) {
		super();
		this.idalquiler = idalquiler;
		this.dnilector = dnilector;
		ASIN = aSIN;
		this.fechasalida = fechasalida;
		this.fechaentrada = fechaentrada;
	}

	public int getIdalquiler() {
		return idalquiler;
	}

	public void setIdalquiler(int idalquiler) {
		this.idalquiler = idalquiler;
	}

	public String getDnilector() {
		return dnilector;
	}

	public void setDnilector(String dnilector) {
		this.dnilector = dnilector;
	}

	public String getASIN() {
		return ASIN;
	}

	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}

	public String getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(String fechasalida) {
		this.fechasalida = fechasalida;
	}

	public String getFechaentrada() {
		return fechaentrada;
	}

	public void setFechaentrada(String fechaentrada) {
		this.fechaentrada = fechaentrada;
	}

}
