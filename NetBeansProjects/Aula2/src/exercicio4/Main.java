/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 19221080
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Bem vindo a calculadora!");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        Calculadora cal = new Calculadora(num1, num2);

        System.out.println("Soma: " + cal.somaNumeros());
        System.out.println("Subt: " + cal.subtrNumeros());
        System.out.println("Mult: " + cal.multNumeros());
        System.out.println("Divi: " + cal.divNumeros());

        System.out.println("Div F: " + cal.divNumeros(num1, num2));
    }

}
