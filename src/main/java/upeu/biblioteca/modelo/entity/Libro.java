package upeu.biblioteca.modelo.entity;

public class Libro {
	private String ASIN;
	private String titulo;
	private String fechalanzamiento;
	private int idautor;
	private int idcategoria;
	private int ideditorial;
	private String idioma;
	private String paginas;
	private String descripcion;
	private String portada;

	public Libro() {
		super();
	}

	public Libro(String aSIN, String titulo, String fechalanzamiento, int idautor, int idcategoria, int ideditorial,
			String idioma, String paginas, String descripcion, String portada) {
		super();
		ASIN = aSIN;
		this.titulo = titulo;
		this.fechalanzamiento = fechalanzamiento;
		this.idautor = idautor;
		this.idcategoria = idcategoria;
		this.ideditorial = ideditorial;
		this.idioma = idioma;
		this.paginas = paginas;
		this.descripcion = descripcion;
		this.portada = portada;
	}

	public String getASIN() {
		return ASIN;
	}

	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechalanzamiento() {
		return fechalanzamiento;
	}

	public void setFechalanzamiento(String fechalanzamiento) {
		this.fechalanzamiento = fechalanzamiento;
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdeditorial() {
		return ideditorial;
	}

	public void setIdeditorial(int ideditorial) {
		this.ideditorial = ideditorial;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

}
