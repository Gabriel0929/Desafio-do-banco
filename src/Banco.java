import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Banco extends Cliente{

    private Cliente nome;
    private String endereco;
    private String contato;
    private String email;
    private String cpfCnpj;

    public Banco(Cliente nome, String endereco, String contato, String email, String cpfCnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
    }

    protected String dadosCliente(){
        return "Nome: " + nome.getNomeCliente()
                + "\nEndereço: " + this.endereco
                + "\nContato: " + this.contato
                + "\nE-mail: " + this.email
                + "\nCPF/CNPJ: " + this.cpfCnpj + "\n";
    }
}
/*
public class Banco extends Cliente {
    private   String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
*/