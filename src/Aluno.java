
public class Aluno {
	String Nome;
	double N1;
	double N2;
	double AI;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getN1() {
		return N1;
	}

	public void setN1(double n1) {

		N1 = n1;
	}

	public double getN2() {
		return N2;
	}

	public void setN2(double n2) {
		N2 = n2;
	}

	public double getAI() {
		return AI;
	}

	public void setAI(double aI) {
		AI = aI;
	}

	public String toString() {
		String n1 = String.valueOf(N1);
		String n2 = String.valueOf(N2);
		String mf = String.valueOf(Math.floor(((N1 * 0.4) + (N2 + AI * 0.6) * 10) / 10));
		while (n1.length() < 4)
			n1 = n1.concat(" ");
		while (n2.length() < 4)
			n2 = n2.concat(" ");
		while (mf.length() < 4)
			mf = mf.concat(" ");
		if ((N1 * 0.4) + (N2 + AI * 0.6) < 5)
			return this.Nome + "II " + n1 + " II " + n2 + " II " + this.AI + " II " + mf + " II Reprovado II\n";
		else
			return this.Nome + "II " + n1 + " II " + n2 + " II " + this.AI + " II " + mf + " II Aprovado  II\n";
	}
}
