package excecoes;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try{
	            int idade = 15;
	            
	            if (idade < 18) {
	                //lançam exceções
	                throw new Exception("Idade invalida. ");
	            }
	            
	        }catch(Exception e){
	            System.out.println("Erro: " + e.getMessage());
	            
	        }finally {
	            System.out.println("Sistema continua. ");
	            //throw cria o erro
	            //catch resolve o erro.
	        }

	    }

	}