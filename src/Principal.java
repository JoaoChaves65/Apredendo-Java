
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.cor = "Preto";
        carro.modelo = "Fiat";
        carro.desligar();

        Carro carro1 = new Carro();
        
        Carro carro2 = new Carro("Vermelho", "Chevrolet", "Flex");
        
        
        System.out.println(carro.resultado());
        System.out.println(carro1.resultado());
        System.out.println(carro2.resultado());
        
        
        
    }
}
