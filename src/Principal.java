
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Motorista m = new Motorista();
        m.setCpf("100200300-40");
        m.setNome("Pedro");
        m.setTelefone("86 99999-8888");
        
        JOptionPane.showMessageDialog(null, "Nome: " + m.getNome());
        JOptionPane.showMessageDialog(null, "CPF: " + m.getCpf());
        JOptionPane.showMessageDialog(null, "Telefone: " + m.getTelefone());
    }
}
