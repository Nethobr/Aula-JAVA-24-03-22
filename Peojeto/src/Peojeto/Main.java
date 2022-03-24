package Peojeto;

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in );
		
		//VAR'S
		int qtd = 5;
		int count = 0;
		int countAluno = 0;
		
		String nome [] = new String [qtd];
		double notas [] = new double [qtd];
		double pesos [] = {0.05, 0.05, 0.2, 0.2, 0.05};
		double notaFinal [] = new double [qtd];
		
		//START
		System.out.println("*********Alunos*********");
		for (int i = 0; i < qtd; i++)
		{
			System.out.printf("Nome do aluno %d: ", count + 1);
			nome [i] = input.next();
			notaFinal [i] = 0;
			//Verefica números válidos
			do
			{
				System.out.printf ("Nota %d: ", count + 1);
				double temp = input.nextDouble();

				if (temp >=0 && temp < 10)
				{
					notas [count] = temp;
					notaFinal [i] = notaFinal [i]  + (notas[count] * pesos[count]);
					notas [count] = 0;
					count ++;
				} else { System.out.println("Nota inválida!"); }
				//reset temp
				temp = 0;
			} while (count < qtd);	//fim do while
			//reset contador
			count = 0;
			countAluno ++;
			System.out.println("Deseja continuar? Y / N");
			int tempAlu = input.nextInt();
			if(tempAlu == 0)
			{
				break;
			}
			System.out.println();
		}	//fim for
			
		System.out.println("*********NOTAS*********");
		for (int i = 0; i < countAluno; i++)
		{
			System.out.printf("Nome do aluno: %s\n", nome [i]); 
			//aprovado
			if (notaFinal [i] >= 6) { System.out.println("Apovado: sim (X) - não ( )"); }
			else { System.out.println("Apovado: sim () - não (X)"); }

			System.out.printf("Nota Final: %.2f\n", notaFinal [i]);
			System.out.println();
		}	//fim for
		input.close();
	}	//fim main
}
