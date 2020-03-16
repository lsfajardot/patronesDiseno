/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno;
import patronesdiseno.ejecutorPatron;
/**
 *
 * @author luigifajardotoloza
 */
public class activadorCarta implements ejecutorPatron{
            @Override
        public void operacion() {
        System.out.println("Carta Magica");
        carta mCard = new cartaMagica();
        mCard.setCard();
        mCard.activeCard();
        
        System.out.println("Carta Monstruo");
        carta tCard = new cartaTrampa();
        tCard.setCard();
        tCard.activeCard();
    }
}
