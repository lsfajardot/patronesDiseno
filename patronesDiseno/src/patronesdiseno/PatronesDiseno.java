/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno;
import patronesdiseno.activadorCarta;
import patronesdiseno.ejecutorPatron;
/**
 *
 * @author luigifajardotoloza
 */
public class PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejecutorPatron ejecutorPatron2 = null;
                ejecutorPatron2 = new activadorCarta();
        System.out.println("Patron: 'Adapter'");
        ejecutorPatron2.operacion();
    }
       
    
}