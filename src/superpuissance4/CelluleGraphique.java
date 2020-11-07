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
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon imgDesint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon imgTrouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
 
        if (celluleAssociee.presenceDesintegrateur()==true){
            setIcon(imgDesint);
        }
        else{
            String couleurJeton=celluleAssociee.lireCouleurDuJeton();
            switch (couleurJeton){
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
                case "vide":
                    setIcon(imgVide);
                    break;
            }
    }
}
}
