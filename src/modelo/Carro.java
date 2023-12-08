package modelo;


import javax.swing.JOptionPane;

public class Carro {

    //Atributos
    public String cor;
    private String modelo;
    public String tipoCombustivel;
    public double valor;
    public int velocidade;
    public int posicaoMarcha;

    public Carro() {
        cor = "Amerelo";
        modelo = "Fiat";
        tipoCombustivel = "Gasolina";
    }

    public Carro(String cor, String modelo, String tipoCombustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
    }

    //Métodos
    public void ligar() {
        JOptionPane.showMessageDialog(null, "O carro está ligado");
        velocidade = 0;
        posicaoMarcha = 0;
    }

    private void desligar() {
        JOptionPane.showMessageDialog(null, "O carro está desligado");
    }

    public void acelerar() {
        velocidade = velocidade + 10;
    }

    public int retornarVelocidade() {
        return velocidade;
    }

    public void mudarMarcha() {
        posicaoMarcha = posicaoMarcha + 1;
    }

    public String mensagem() {
        return "A velocidade é = " + velocidade + ", A posição da marcha é = " + posicaoMarcha;
    }

    public String resultado() {
        return "Cor - " + cor + ", Modelo " + modelo + ", Tipo de Combustível - " + tipoCombustivel;
    }

    public void acelerarManualmente(int pesoDaVelocidade) {
        velocidade = velocidade + pesoDaVelocidade;
    }

    public double valorComDesconto(int desconto) {
        return valor - (valor * desconto / 100);
    }

}
