package upeu.biblioteca.modelo.entity;

public class Categoria {
	private int idcategoria;
	private String ncategoria;

	public Categoria() {
		super();
	}

	public Categoria(int idcategoria, String ncategoria) {
		super();
		this.idcategoria = idcategoria;
		this.ncategoria = ncategoria;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNcategoria() {
		return ncategoria;
	}

	public void setNcategoria(String ncategoria) {
		this.ncategoria = ncategoria;
	}

}
