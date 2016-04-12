//		Pede ao usuário os dois intervalos da PA
//		a1 = primeiro termo = 1 (neste caso)
//		an = enésimo termo = 100 (o último termo, neste caso)
//		n = quantidade de números da PA
//		S = soma dos termos da PA
//
//		S = (a1 + an).n/2 

package proj_matematico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Inicio do script somaInteiro

		Scanner input = new Scanner(System.in);

		ExercicioJava somaInteiro = new ExercicioJava();

		System.out.println("Informe o primeiro termo : ");
		somaInteiro.setLimiteInicio(input.nextInt());

		System.out.println("Informe o segundo termo :");
		somaInteiro.setLimiteFim(input.nextInt());

		// Realiza a operação de calculo de soma da PA
		long total = somaInteiro.CalculaPA();

		// int total = ;

		System.out.printf("\nA soma dos valores é : " + total);

		// Fim do Script somaInteiro

	}

}
