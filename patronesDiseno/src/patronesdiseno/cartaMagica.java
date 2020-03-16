/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno;

/**
 *
 * @author luigifajardotoloza
 */
public class cartaMagica extends carta{
    @Override
    public void activeCard() {
        System.out.println("Activo mi carta Magica");
    }
    @Override
    public void setCard() {
        System.out.println("Seteo mi carta Magica");
    }

}
