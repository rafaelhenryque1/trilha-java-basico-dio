package contabanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		
		System.out.println("qual o numero da conta?");
		int conta = sc.nextInt();
		
		System.out.println("qual a agencia?");
		int agencia = sc.nextInt();
		
		System.out.println("qual o saldo em conta?");
		Double saldo = sc.nextDouble();
		
		
		System.out.println("Olá " + nome + "\nobrigado por criar uma conta em nosso banco");
		System.out.println("sua agência é " + agencia);
		System.out.println("cont a" + conta);
		System.out.println("Saldo : " + saldo);
		
		
	}

}

