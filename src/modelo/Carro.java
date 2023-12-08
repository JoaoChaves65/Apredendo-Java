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
    private Motorista motorista;

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
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPosicaoMarcha() {
        return posicaoMarcha;
    }

    public void setPosicaoMarcha(int posicaoMarcha) {
        this.posicaoMarcha = posicaoMarcha;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", modelo=" + modelo + ", tipoCombustivel=" + tipoCombustivel + ", valor=" + valor + ", velocidade=" + velocidade + ", posicaoMarcha=" + posicaoMarcha + ", motorista=" + motorista + '}';
    }

    
    
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
