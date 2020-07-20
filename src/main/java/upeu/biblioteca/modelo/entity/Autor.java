package upeu.biblioteca.modelo.entity;

public class Autor {
	private int idautor;
	private String nautor;

	public Autor() {
		super();
	}

	public Autor(int idautor, String nautor) {
		super();
		this.idautor = idautor;
		this.nautor = nautor;
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public String getNautor() {
		return nautor;
	}

	public void setNautor(String nautor) {
		this.nautor = nautor;
	}

}
