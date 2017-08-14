import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class relatorio_Aluno {

	public static String ASCII_Nome() {

		Random ASCII = new Random();
		String Nome = new String();
		int QntNome = ASCII.nextInt(4) + 2;
		int Qnt = ASCII.nextInt((10 - 5) + 1) + 5;
		for (int j = 0; j < QntNome; j++) {
			for (int i = 0; i < Qnt; i++) {
				int LetraMin = ASCII.nextInt((122 - 97) + 1) + 97;
				int LetraMax = ASCII.nextInt((90 - 65) + 1) + 65;
				if (i == 0)
					Nome = Nome.concat(String.valueOf((char) LetraMax));
				else
					Nome = Nome.concat(String.valueOf((char) LetraMin));
			}
			if (j + 1 != QntNome)
				Nome = Nome.concat(" ");
		}

		while (Nome.length() < 60) {
			Nome = Nome.concat(" ");
		}
		return Nome;
	}
	
	public static void SorteiaNomes() throws IOException {
			PrintWriter outputStream = null;
			Aluno aluno = new Aluno();
			try {
				outputStream = new PrintWriter(new FileWriter("Relatorio_AED.txt"));
				outputStream.write("################################################PUC  Goias################################################\n");
				outputStream.write("                            Nome                            II N 1  II N 2  II A.I II M.F  II Situação  II\n");
				for(int i = 0; i <50; i++){
						double Nota = new Random().nextDouble() * 10;
						aluno.setNome(ASCII_Nome());
						aluno.setN1(Math.floor(Nota * 10) / 10);
						aluno.setN2(Math.floor(Nota * 10) / 10);
						aluno.setAI(Math.floor(Nota) / 10);
						outputStream.write(aluno.toString());
						aluno = new Aluno();
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(aluno.toString());
				}finally {
				outputStream.write("################################################PUC  Goias################################################\n");
				if (outputStream != null) {
					outputStream.close();
				}
			}
		}
	public static void main(String[] args) throws IOException {
		SorteiaNomes();
	}
}
