package introducao;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class atividadeoit {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int duracaoEvent;
		int horas;
		int minutos;
		int segundos;
		System.out.println ("Diga a duração do evento expressa em segundos, por gentileza");
		duracaoEvent= read.nextInt();
		horas= duracaoEvent/3600;
		minutos=(duracaoEvent%3600)/60;
		segundos=(duracaoEvent%3600)%60;
		System.out.printf("a duração do evento correspondeu a" + horas + "horas" + minutos + "minutos" + "e" + segundos + "segundos\n");
				

	}

}
