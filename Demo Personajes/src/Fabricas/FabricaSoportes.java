/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import javax.swing.ImageIcon;
import Movimientos.Arriba.*;
import Movimientos.Abajo.*;
import Movimientos.Izquierda.*;
import Movimientos.Derecha.*;

/**
 *
 * @author Kevin Garcia
 */
public class FabricaSoportes implements FabricaAbstracta{

    @Override
    public ImageIcon[] crearArriba() {
        Arriba arriba = new ArribaSoportes();
        return arriba.getSprites();
    }

    @Override
    public ImageIcon[] crearAbajo() {
        Abajo abajo = new AbajoSoportes();
        return abajo.getSprites();
    }

    @Override
    public ImageIcon[] crearIzquierda() {
        Izquierda izquierda = new IzquierdaSoportes();
        return izquierda.getSprites();
    }

    @Override
    public ImageIcon[] crearDerecha() {
        Derecha derecha = new DerechaSoportes();
        return derecha.getSprites();
    }
    
}
