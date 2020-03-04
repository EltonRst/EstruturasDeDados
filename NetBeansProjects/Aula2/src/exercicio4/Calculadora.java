/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author 19221080
 */
public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora() {
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double somaNumeros() {
        return somaNumeros(this.num1, this.num2);
    }

    public double somaNumeros(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrNumeros() {
        return subtrNumeros(this.num1, this.num2);
    }

    public double subtrNumeros(double num1, double num2) {
        return num1 - num2;
    }

    public double multNumeros() {
        return multNumeros(this.num1, this.num2);
    }

    public double multNumeros(double num1, double num2) {
        return num1 * num2;
    }

    public double divNumeros() {
        return divNumeros(this.num1, this.num2);
    }

    public double divNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
