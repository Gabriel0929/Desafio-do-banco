public class ContaPaupanca  extends  Conta {


    public ContaPaupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#############################################");
        System.out.println("\t\t=== Extrato Conta Poupanca ===\n");
        super.imprimirInfosComuns();

    }

}
