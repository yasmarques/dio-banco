public abstract class Conta implements iConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

 
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;;
        this.conta = SEQUENCIAL++;
    }
    
    public Conta(Cliente cliente2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void transferir(double valor, iConta ContaDestino) {
    
        
    }

    public void sacar(double valor) {
        this.saldo += valor;
    
    }
    public void depositar(double valor) {
        this.saldo -= valor;
    }
  
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
