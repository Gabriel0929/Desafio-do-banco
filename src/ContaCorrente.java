public class ContaCorrente extends  Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#############################################");
        System.out.println("\t\t=== Extrato Conta Corrente ===\n");
        super.imprimirInfosComuns();
    }
}
