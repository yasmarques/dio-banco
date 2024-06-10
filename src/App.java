public class App {
    public static void main(String[] args) throws Exception {
        Cliente yasmin = new Cliente();
		yasmin.setNome("Cliente");
		
		Conta cc = new ContaCorrente(yasmin);
		Conta poupanca = new ContaPoupanca(yasmin);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
