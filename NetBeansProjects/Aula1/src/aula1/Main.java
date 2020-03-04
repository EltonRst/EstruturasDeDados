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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Caixa caixa = new Caixa(10, 10, 10);

        System.out.println("Volume da caixa: " + caixa.getVolume());

        Caixa caixaSapato;

        caixaSapato = new Caixa();

        //System.out.println(caixaSapato.cor);
        //System.out.println(caixaSapato);

        caixaSapato.setAltura(10);
        caixaSapato.setLargura(10);
        caixaSapato.setProfundidade(50);

        System.out.println("Volume da caixa de sapatos: " + caixaSapato.getVolume());

        Triangulo tri = new Triangulo(10, 30);
        
        System.out.println("Area do triângulo: "+tri.getArea());
    }

}
