package exercicio_polimorfismo;

public class Vendedor extends Funcionario{
	
	private double totalVendas;
	private double comissao;
	
	public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
		super(nome, salarioBase);
		this.totalVendas = totalVendas;
		this.comissao = comissao;
	}
	
	
	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	@Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissao);
        
        }
	@Override
	 public void exibirContracheque() {
        System.out.println("CONTRACHEQUE VENDEDOR");
        super.exibirContracheque();
        System.out.printf("Total Vendas: R$ %.2f\n", totalVendas);
        System.out.printf("Comissão (%.0f%%): R$ %.2f\n", comissao * 100, totalVendas * comissao);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", calcularSalario());
	
	}

}
