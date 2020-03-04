/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2e3;

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
        Funcionario f;
        f = new Funcionario();
        f.setNome("Elton Reisdorfer");
        
        System.out.println("Nome: "+f.getNome()+" E-mail: "+f.getEmail());
    }
    
}
