import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		
		//declaração das  variaveis
		
		int a=0, b=0, c=0;
		
		Scanner sc = new Scanner(System.in);
		
		//entrada do usuario
		
		System.out.println("entre com o primeiro numero");
		a=sc.nextInt();
		
		System.out.println("entre com o segundo numero");
		b=sc.nextInt();
		
		//tratamento da condição
		
		try {
			c = contar(a, b);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		//processamento
		
		
		for(int i = 0; i >= c; i--) {
			System.out.println("imprimindo numero: " + i);
		}
		
		
	
		}
		
	
	//metodo conatar
	
	static int contar (int a , int b) throws ParametrosInvalidosException {
		
		int contagem = a - b;
		
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		return contagem;
		
	}
	

}
