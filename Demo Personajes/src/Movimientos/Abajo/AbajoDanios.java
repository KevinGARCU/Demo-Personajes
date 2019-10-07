/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos.Abajo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class AbajoDanios extends Abajo{
    
    ImageIcon img;

    @Override
    public Image[] getSprites() {
        abajo[0] = new ImageIcon(getClass().getResource("../Sprites/Danios/ftr1_fr1.gif")).getImage();
        /*Image[][] ataqueShiny = {{new ImageIcon(getClass().getResource("../Steve/AtaqueShiny0.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny3.png")).getImage()
        }*/
        return abajo;
    }
    
}
