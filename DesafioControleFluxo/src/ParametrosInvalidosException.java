
public class ParametrosInvalidosException extends Exception{
	public static void main(String[] args) {
		
		}
		static void parametroInvalido(int a, int b) throws ParametrosInvalidosException{
			if(a>b) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
			
		} 
	}

