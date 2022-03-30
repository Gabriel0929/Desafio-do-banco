
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public abstract class Conta implements IConta{

    private  static final String AGENCIA_PADRAO = "Banco Digital";
    private static int SEQUENCIAL = 1;

    protected  String agencia;
    protected int numero;
    protected   double saldo;
    protected  Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;


    }

    @Override
    public void depositar(double valor) {
        saldo+= valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

/*
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
*/
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("\n\t\tNumero: %d", this.numero));
        System.out.println(String.format("\nSaldo: R$ %.2f", this.saldo));
        System.out.println(String.format("\nTitular: %s", this.cliente.getNomeCliente()));
        System.out.println("===================================================\n");


    }


}

