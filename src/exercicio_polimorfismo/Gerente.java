package exercicio_polimorfismo;

public class Gerente extends Funcionario{

	    private double bonusFixo;

		public Gerente(String nome, double salarioBase, double bonusFixo) {
			super(nome, salarioBase);
			this.bonusFixo = bonusFixo;
		}
		

		public double getBonusFixo() {
			return bonusFixo;
		}


		public void setBonusFixo(double bonusFixo) {
			this.bonusFixo = bonusFixo;
		}


		@Override
	    public double calcularSalario() {
	        return getSalarioBase() + bonusFixo;
	    }

	    @Override
	    public void exibirContracheque() {
	        System.out.println("ContrachequeGerente");
	        super.exibirContracheque();
	        System.out.printf("Bônus: R$ %.2f\n", bonusFixo);
	        System.out.printf("Salário Total: " , calcularSalario());
	        
	       
	    }
	}

