package course;

public class Aluguel {

	private Student student;
	private int quarto;
	
	public Aluguel(Student student, int quarto) {
		super();
		this.student = student;
		this.quarto = quarto;
	}

	public int getQuarto() {
		return quarto;
	}

	public Student getStudent() {
		return student;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

}
