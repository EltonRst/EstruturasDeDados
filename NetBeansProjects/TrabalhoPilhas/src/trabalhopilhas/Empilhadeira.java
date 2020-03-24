/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopilhas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elton
 */
public class Empilhadeira {

    private final List<Double> capacidade;

    public Empilhadeira() {
        this.capacidade = new ArrayList() {
            {
                add(3);
                add(5);
                add(7);
            }
        };
    }

}
