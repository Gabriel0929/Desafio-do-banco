import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.setNomeCliente("Gabriel Gonzales");
        Conta cc = new ContaCorrente(gabriel);
        Conta poupanca = new ContaPaupanca(gabriel);
        cc.depositar(300);
        cc.transferir(250,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente ana = new Cliente();
        ana.setNomeCliente("Ana Silva");
        Conta cc2 = new ContaCorrente(ana);
        Conta poupanca2 = new ContaPaupanca(ana);
        cc2.depositar(1000);
        cc2.transferir(50,poupanca2);
        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        Cliente bancox = new Cliente();
        bancox.setNomeCliente("Banco o mais grande du mundo");
        Conta cc3 = new ContaCorrente(bancox);
        Conta poupanca3 = new ContaPaupanca(bancox);
        cc3.depositar(99000);
        cc3.imprimirExtrato();
        poupanca3.imprimirExtrato();

        //Lista dos clientes:
        ArrayList<Banco> bancos = new ArrayList<>();
        Banco cliente1 = new Banco(gabriel, "Rua Murunvi - nº: 123 - SP", "11-99999-9999", "gabriel@gmail.com", "111.111.111.11");
        bancos.add(cliente1);

        Banco cliente2 = new Banco(ana, "Rua Santos - nº: 12 - SP-Santos", "11-22222-2222", "ana@gmail.com", "222.222.222.22");
        bancos.add(cliente2);

        Banco cliente3 = new Banco(bancox, "Rua Janeiro- nº: 333 - SP-SP", "11-33333-3333", "bancox@hotmail.com", "33.333.333/3333-33");
        bancos.add(cliente3);

        for (int i = 0; i < bancos.size(); i++){
            System.out.println(bancos.get(i).dadosCliente());
        }

    }
}
