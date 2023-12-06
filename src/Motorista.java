
public class Motorista {

    //Atributos
    private String nome;
    private String cpf;
    private String telefone;

    //Construtor
    public Motorista() {
    }

    //Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + '}';
    }
    
    
}
