package exercicio_polimorfismo;

public class Programador extends Funcionario {
	
	private int horasExtras;
	private double valorHoraExtra;

public Programador(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
		super(nome, salarioBase);
		this.horasExtras = horasExtras;
		this.valorHoraExtra = valorHoraExtra;
	}

	public int getHorasExtras() {
	return horasExtras;
}


public void setHorasExtras(int horasExtras) {
	this.horasExtras = horasExtras;
}

public double getValorHoraExtra() {
	return valorHoraExtra;
}

public void setValorHoraExtra(double valorHoraExtra) {
	this.valorHoraExtra = valorHoraExtra;
}


	@Override
		public double calcularSalario() {
	        return getSalarioBase() + (horasExtras * valorHoraExtra);
	}
		@Override
	    public void exibirContracheque() {
	        System.out.println("CONTRACHEQUE PROGRAMADOR ");
	        super.exibirContracheque();
	        System.out.println("Horas Extras: " + horasExtras);
	        System.out.printf("Valor Hora Extra: R$ %.2f\n", valorHoraExtra);
	        System.out.printf("Total Extras: R$ %.2f\n", horasExtras * valorHoraExtra);
	        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", calcularSalario());
	    }
	}
	
	

