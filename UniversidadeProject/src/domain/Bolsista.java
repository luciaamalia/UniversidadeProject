package domain;

public class Bolsista extends Aluno{
	private float bolsa;
	public void RenovarBolsa() {
		System.out.println("Bolsa renovada do curso " + this.getCurso() + "para o aluno "+ this.getNome()  );
		
	}

	@Override //sobrepor
	public void PagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista, pagamento facilitado");
		
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float f) {
		this.bolsa = f;
	}
	
}
