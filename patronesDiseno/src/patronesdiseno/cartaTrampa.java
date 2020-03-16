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
public class cartaTrampa extends carta{
    cartaMonstruo carta = new cartaMonstruo();

    @Override
    public void activeCard() {
        carta.activeMonster();
    }

    @Override
    public void setCard() {
        carta.setMonster();
    } 
}
