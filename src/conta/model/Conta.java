package conta.model;

public class Conta {

	// Atributos/Variaveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Método Especial - Método Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {

		// this => Classe Conta
		// Conta.numero = atributo
		// numero = 6
		// this.numero = 6

		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Comportamentos/Métodos

	// Métodos de Acesso

	// Get -> Pegar(Buscar)
	public int getNumero() {
		return numero;
	}

	// Set -> Colocar/Setar
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("\n\n*************************************");
		System.out.println("Dados da conta:");
		System.out.println("*************************************");
		System.out.println("Número da conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	}

}
