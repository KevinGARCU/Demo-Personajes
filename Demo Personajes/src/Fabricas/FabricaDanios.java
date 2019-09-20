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
public class FabricaDanios implements FabricaAbstracta{

    @Override
    public ImageIcon[] crearArriba() {
        Arriba arriba = new ArribaDanios();
        return arriba.getSprites();
    }

    @Override
    public ImageIcon[] crearAbajo() {
        Abajo abajo = new AbajoDanios();
        return abajo.getSprites();
    }

    @Override
    public ImageIcon[] crearIzquierda() {
        Izquierda izquierda = new IzquierdaDanios();
        return izquierda.getSprites();
    }

    @Override
    public ImageIcon[] crearDerecha() {
        Derecha derecha = new DerechaDanios();
        return derecha.getSprites();
    }
    
}
