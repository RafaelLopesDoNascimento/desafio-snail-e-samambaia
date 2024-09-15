package test02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//entrada de dados
		int columns, rows;
		System.out.println("Columns:");
		columns = sc.nextInt();
		System.out.println("Rows:");
		rows = sc.nextInt();
		int[][] matriz = new int[rows][columns];
		sc.nextLine();

		//Inserindo os dados em cada linha em uma linha de entrada. ex: 5 7 8 15
		for (int i = 0; i < columns; i++) {
			System.out.println("Time: " + i);
			String save = sc.nextLine();
			String[] saveInt = save.split(" ");
			int[] arrayInt = new int[columns];
			for (int j = 0; j < columns; j++) {
				arrayInt[j] = Integer.parseInt(saveInt[j]);
			}

			matriz[i] = arrayInt;
		}

		snail(matriz);

		sc.close();
	}

	public static void snail(int matriz[][]) {
		List<Integer> arrayListMatriz = new ArrayList<>();
		// Limites da matriz
		int linhaInicio = 0;
		int linhaFim = matriz.length - 1;
		int colunaInicio = 0;
		int colunaFim = matriz[0].length - 1;

        //Estrutura de repetição para percorrer quatro lados da matriz e repetir caso acha algum campo que não foi percorrido 		
		while (linhaInicio <= linhaFim && colunaInicio <= colunaFim) {
			for (int i = colunaInicio; i <= colunaFim; i++) {
				arrayListMatriz.add(matriz[linhaInicio][i]);
			}
			linhaInicio++;

			for (int i = linhaInicio; i <= linhaFim; i++) {
				arrayListMatriz.add(matriz[i][colunaFim]);
			}
			colunaFim--;

			if (linhaInicio <= linhaFim) {
				for (int i = colunaFim; i >= colunaInicio; i--) {
					arrayListMatriz.add(matriz[linhaFim][i]);
				}
				linhaFim--;
			}

			if (colunaInicio <= colunaFim) {
				for (int i = linhaFim; i >= linhaInicio; i--) {
					arrayListMatriz.add(matriz[i][colunaInicio]);
				}
				colunaInicio++;
			}
		}
		System.out.println("Matriz em espiral: " + arrayListMatriz);
	}

}
