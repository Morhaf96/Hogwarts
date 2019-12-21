/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class Start {

    public static void main(String[] args) {
        DataHanterare.dataHanterare();
        new HuvudMeny().setVisible(true);
    }

}
