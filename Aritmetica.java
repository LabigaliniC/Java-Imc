import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		int n1;  // primeiro número solicitado
		int n2;  // segundo número solicitado
		int soma;  // soma dos dois números
		int mult;
		int sub;
		double div;		
		
		// Pedir 2 números para o usuário
		// Cria um objeto de Scanner que lê
		// da entrada padrão (System.in);
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o numero 1: ");
		n1 = entrada.nextInt();
		System.out.print("Insira o numero 2: ");
		n2 = entrada.nextInt();			
		
		entrada.close();
		
		// Operações matematicas entre os dois números
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;		
		div = n1 / n2;
		// Imprimir a soma
		System.out.printf("Soma: %d\n", soma);
		// Imprimir a subtração
		System.out.printf("Subtracao: %d\n", sub);
		// Imprimir a multiplicação
		System.out.printf("Multiplicacao: %d\n", mult);	
		// Imprimir a divisão
		System.out.printf("Divisão: %f\n", div);
		
		if (n1 > n2){			
			System.out.printf("O maior e %d\n", n1);
		}
		else if (n1 < n2){			
			System.out.printf("O maior e %d\n", n2);
		}
		else{
			System.out.printf("Os numeros são iguais");
		};			
		
	}
}