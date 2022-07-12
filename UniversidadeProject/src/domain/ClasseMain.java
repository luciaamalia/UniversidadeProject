package domain;

public class ClasseMain {

	public static void main(String[] args) {
	 //Pessoa p1 = new Pessoa();
	/*Visitante v1 = new Visitante();
	v1.setNome ("Vitor");
	v1.setIdade(21);
	v1.setSexo("M");
	System.out.println(v1.toString());*/
	
	Aluno a1 = new Aluno();
	a1.setNome("Lucia");
	a1.setIdade(20);
	a1.setSexo("F");
	a1.setMatricula(23416823);
	a1.setCurso("Big Data");
	a1.PagarMensalidade();	
	
	
	Bolsista b1 = new Bolsista();
	b1.setNome("José");
	b1.setIdade(23);
	b1.setMatricula(34545);
	b1.setSexo("M");
	b1.setCurso("Geografia");
	b1.setBolsa(12.5f);
	b1.PagarMensalidade();
	
	}

	
}
