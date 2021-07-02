package introducao;

import java.util.Scanner;

public class javaum {

	public static void main(String[] args) {
	Scanner read= new Scanner (System.in);
        int idadeEmanos;
        int meses;
        int dias;
        int idadeDias;

        System.out.println("digite sua idade expressa em anos");
        idadeEmanos=read.nextInt();
        System.out.println("digite o seu mês de aniverssário");
        meses=read.nextInt();
        System.out.println("digite o dia do seu aniverssáio");
        dias=read.nextInt();
        idadeDias=(idadeEmanos*365)+((7-meses)*30)+(1-dias);
        System.out.println("sua idade em dias é :" + idadeDias);

	}

}
