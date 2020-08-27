/*
Crie um aplicativo de calculadora IMC que leia o peso do usuário 
em kg e altura em metros e calcule e exiba o índice de massa 
corporal dele. Além disso, exiba as informações sobre IMC:

IMC = peso / (altura * altura)

Valores de IMC:
Abaixo do peso: menor que 18.5
Normal: entre 18.5 e 24.9
Sobrepeso: entre 25 e 29.9
Obeso: 30 ou maior
*/

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		double altura;  // altura solicitado
		double peso;  // peso solicitado
		double massa;
		
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o sua altura em metros: ");
		altura = entrada.nextDouble();
		System.out.print("Insira o seu peso: ");
		peso = entrada.nextDouble();
		
		entrada.close();		
		
		massa = peso / (altura * altura);
		
		System.out.printf("O seu IMC é: 2.f\n", massa);
		
		if (massa < 18.5){			
			System.out.printf("Abaixo do peso");
			
		}
		else if ((massa >= 18.5) && (massa<= 24.9)){			
			System.out.printf("Normal");
		}
		else if ((massa >= 25) && (massa<= 29.9)){
			System.out.printf("Sobrepeso");
		}
		else 
		{
			System.out.printf("Obeso(a)");
		}
	}
	
}