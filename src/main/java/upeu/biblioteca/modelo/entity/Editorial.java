package upeu.biblioteca.modelo.entity;

public class Editorial {
	private int ideditorial;
	private String neditorial;

	public Editorial() {
		super();
	}

	public Editorial(int ideditorial, String neditorial) {
		super();
		this.ideditorial = ideditorial;
		this.neditorial = neditorial;
	}

	public int getIdeditorial() {
		return ideditorial;
	}

	public void setIdeditorial(int ideditorial) {
		this.ideditorial = ideditorial;
	}

	public String getNeditorial() {
		return neditorial;
	}

	public void setNeditorial(String neditorial) {
		this.neditorial = neditorial;
	}

}
