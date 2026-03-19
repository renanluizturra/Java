package exercício_encapsulamento;

public class Exercicio_3 {
		
		//atributo encapsulado
		private double saldo;

		//construtor para iniciar com saldo inicial
		public Exercicio_3 (double saldoInicial) {
			this.saldo = saldoInicial;
			
		}
		//médoto sem retorno(void)
		//ele apenas executa uma ação e não devolve nada
		public void depositar (double valor) {
			saldo += valor; //adiciona o valor ao saldo
			System.out.println("Depósito realizado! ");
			
		}

		//método com retorno
		//ele devolde um valor para quem chamou o método
		public double consultarSaldo() {
			return saldo;
			
		}
		
		//método para sacar dinheiro
		public void sacar (double valor) {
			
			if(valor <= saldo) {
				saldo = saldo - valor;
				System.out.println("Saque realizado!");
				
			}else {
				System.out.println("Saldo Insuficiente. ");
			}
		}
	}
