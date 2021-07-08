
import java.util.Scanner;
public class ativ4 {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int idade = 0, sexo = 0, caracteristica = 0, count = 0;
		int pessoasCal = 0, mulheresNerv = 0, homensAgress = 0, outrosCal= 0;
		int pessoasNervMais40 = 0, pessoasCalMenos18 = 0;

		while (count != 150) {
			System.out.print("Digite sua idade: ");
			Scanner scan = null;
			idade = scan.nextInt();
			System.out.print("Digite seu sexo(1-feminino/2-masculino/3-Outros): ");
			sexo = scan.nextInt();
			System.out.print("Você é uma pessoa: 1-calma/2-nervosa/3-agressiva: ");
			caracteristica = scan.nextInt();

			if (caracteristica == 1) {
				pessoasCal++;
			}
			if (sexo == 1 && caracteristica == 2) {
				mulheresNerv++;
			}
			if (sexo == 2 && caracteristica == 3) {
				homensAgress++;
			}
			if (sexo == 3 && caracteristica == 1) {
				outrosCal++;
			}
			if (idade > 40 && caracteristica == 2) {
				pessoasNervMais40++;
			}
			if (idade < 18 && caracteristica == 1) {
				pessoasCalMenos18++;
			}
			count++;
		}

	}

}
