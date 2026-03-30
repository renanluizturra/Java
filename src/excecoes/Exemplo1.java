package excecoes;

public class Exemplo1 {

	public static void main(String[] args) {
		

	try {

		int resultado = 550 /0;
		System.out.println(resultado);
		
	}catch(Exception e){
		System.out.println("Ocorreu um erro: ");
		System.out.println("Mensagem: " + e.getMessage());
		System.out.println("Detalhes: ");
		e.printStackTrace();
		
		
		
	}finally {
		System.out.println("Finally executado. ");
	}
	System.out.println("Sistema continua. ");
}
}
