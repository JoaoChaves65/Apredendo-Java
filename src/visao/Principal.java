package visao;

import modelo.Carro;
import modelo.Motorista;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.setCor("Preto");
        c.setTipoCombustivel("Flex");
        c.setModelo("Chevrolet");
        
        System.out.println(c);
//
//        Motorista m = new Motorista();
//        m.setCpf("100200300-40");
//        m.setNome("Pedro");
//        m.setTelefone("86 99999-8888");
//
//        Motorista m2 = new Motorista();
//        m2.setCpf("100200300-40");
//        m2.setNome("Maria");
//        m2.setTelefone("86 99999-8888");
//
//        System.out.println(m.equals(m2));
//
//        if (m.equals(m2)) {
//            JOptionPane.showMessageDialog(null, "Os objetos são iguais");
//        } else {
//            JOptionPane.showMessageDialog(null, "Os objetos são diferentes");
//        }
    }
}
