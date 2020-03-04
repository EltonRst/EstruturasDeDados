/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author 19221080
 */
public class Caixa {

    private double largura;
    private double altura;
    private double profundidade;
    
    public static String cor = "Vermelho";

    public Caixa() {
    }

    public Caixa(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public double getVolume() {
        return largura * altura * profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

}
