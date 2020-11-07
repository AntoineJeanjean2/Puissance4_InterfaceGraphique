/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author antoi
 */
public class CelluleGraphique extends JButton{
    Cellule celluleAssociee;
    ImageIcon imgVide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));

    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        setIcon(imgVide);    //On attribue l'image cellule vide
    }
}
