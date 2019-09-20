/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import javax.swing.ImageIcon;
/**
 *
 * @author Kevin Garcia
 */
public interface FabricaAbstracta {
    public abstract ImageIcon[] crearArriba();
    public abstract ImageIcon[] crearAbajo();
    public abstract ImageIcon[] crearIzquierda();
    public abstract ImageIcon[] crearDerecha();
}
