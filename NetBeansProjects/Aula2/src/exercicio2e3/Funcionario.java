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
public class Funcionario {
   
    private String nome;
    private String email;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;      
        geraEmail(nome);
    }

    private void geraEmail(String nome){
        this.email = nome.substring(0,1).toLowerCase()+nome.split(" ")[1].toLowerCase()+"@estuturadedados.com";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        geraEmail(nome);
    }

    public String getEmail() {
        return email;
    }   
    
}
