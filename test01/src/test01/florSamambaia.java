package test01;

import java.util.Scanner;

public class florSamambaia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Entrada de dados dos diametros
		int x1, x2, y1, y2, r1, r2;
		System.out.println("Valor de x1:");
		x1 = sc.nextInt();
		System.out.println("Valor de y1:");
		y1 = sc.nextInt();
		System.out.println("Valor de r1:");
		r1 = sc.nextInt();
		System.out.println("Valor de x2:");
		x2 = sc.nextInt();
		System.out.println("Valor de y2:");
		y2 = sc.nextInt();
		System.out.println("Valor de r2:");
		r2 = sc.nextInt();

		System.out.println(tentativaDesenhar(r1, x1, y1, r2, x2, y2));
		
		sc.close();
	}

	public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
		//Variaveis que verificam sem as partes extremas do diametro do caçador estão para fora ou para dentro do diametro da flor. ex: se a posição em x da flor e mais o seu raio forem maiores que o posicionamento e o raio do diamtro do caçador, significa que ele está dentro do seu diametro
		boolean cima = y1 + r1 >= y2 + r2;
		boolean baixo = -y1 - r1 <= -y2 - r2;
		boolean direita = x1 + r1 >= x2 + r2;
		boolean esquerda = -x1 - r1 <= -x2 - r2;
		if (direita && esquerda && cima && baixo) {
			return "RICO";
		} else {
			return "MORTO";

		}

	}

}
