/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author 19221080
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("Élton");
        System.out.println(p.getNome());
        alteraNome(p);
        System.out.println(p.getNome());
    }
    
    public static void alteraNome(Pessoa p)
    {
        p.setNome("João");
    }
}
