/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author antoi
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    Joueur[] listeJoueurs= new Joueur[2];
    Grille grilleJeu=new Grille();
    Joueur joueurCourant;
    
    public fenetreDeJeu() {
        initComponents();
        panneauInfoJoueurs.setVisible(false);
        panneauInfoPartie.setVisible(false);
        
        for(int i=5;i>=0;i--){
            for (int j=0; j<7; j++){
                CelluleGraphique cellGraph=new CelluleGraphique(grilleJeu.Cellules[i][j]);
                panneauGrille.add(cellGraph);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauGrille = new javax.swing.JPanel();
        panneauInfoPartie = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        panneauCreationPartie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomJoueur1 = new javax.swing.JTextField();
        nomJoueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneauInfoJoueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JTextField();
        lbl_j1_nom1 = new javax.swing.JTextField();
        lbl_j2_nom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j1_couleur = new javax.swing.JTextField();
        btn_col0 = new javax.swing.JButton();
        btn_col1 = new javax.swing.JButton();
        btn_col2 = new javax.swing.JButton();
        btn_col3 = new javax.swing.JButton();
        btn_col4 = new javax.swing.JButton();
        btn_col5 = new javax.swing.JButton();
        btn_col6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneauGrille.setBackground(new java.awt.Color(255, 255, 255));
        panneauGrille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 672, 576));

        panneauInfoPartie.setBackground(new java.awt.Color(0, 204, 204));
        panneauInfoPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Infos Jeu");
        panneauInfoPartie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel9.setText("Joueur Courant :");
        panneauInfoPartie.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lbl_jcourant.setText("nomJoueurCourant");
        lbl_jcourant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_jcourantActionPerformed(evt);
            }
        });
        panneauInfoPartie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneauInfoPartie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 60));

        getContentPane().add(panneauInfoPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 290, 160));

        panneauCreationPartie.setBackground(new java.awt.Color(0, 204, 204));
        panneauCreationPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Nom Joueur 2 :");
        panneauCreationPartie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Nom Joueur 1 :");
        panneauCreationPartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panneauCreationPartie.add(nomJoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 140, -1));

        nomJoueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomJoueur2ActionPerformed(evt);
            }
        });
        panneauCreationPartie.add(nomJoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, -1));

        btn_start.setText("Démarrer la Partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneauCreationPartie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        getContentPane().add(panneauCreationPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 290, 140));

        panneauInfoJoueurs.setBackground(new java.awt.Color(0, 204, 204));
        panneauInfoJoueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Infos Joueurs");
        panneauInfoJoueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel4.setText("Couleur :");
        panneauInfoJoueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneauInfoJoueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel6.setText("Couleur :");
        panneauInfoJoueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setText("Joueur 2 :");
        panneauInfoJoueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lbl_j2_couleur.setText("couleurJoueur2");
        lbl_j2_couleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_j2_couleurActionPerformed(evt);
            }
        });
        panneauInfoJoueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lbl_j1_nom1.setText("nomJoueur1");
        lbl_j1_nom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_j1_nom1ActionPerformed(evt);
            }
        });
        panneauInfoJoueurs.add(lbl_j1_nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lbl_j2_nom.setText("nomJoueur2");
        lbl_j2_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_j2_nomActionPerformed(evt);
            }
        });
        panneauInfoJoueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        panneauInfoJoueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 20));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneauInfoJoueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        getContentPane().add(panneauInfoJoueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 290, 220));

        btn_col0.setText("1");
        getContentPane().add(btn_col0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn_col1.setText("2");
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, -1, -1));

        btn_col2.setText("3");
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 10, -1, -1));

        btn_col3.setText("4");
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, -1, -1));

        btn_col4.setText("5");
        btn_col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 10, -1, -1));

        btn_col5.setText("6");
        getContentPane().add(btn_col5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btn_col6.setText("7");
        getContentPane().add(btn_col6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 10, -1, -1));

        setBounds(0, 0, 1044, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void nomJoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomJoueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomJoueur2ActionPerformed

    private void btn_col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col4ActionPerformed

    private void lbl_j2_couleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_j2_couleurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_j2_couleurActionPerformed

    private void lbl_j1_nom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_j1_nom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_j1_nom1ActionPerformed

    private void lbl_j2_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_j2_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_j2_nomActionPerformed

    private void lbl_jcourantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_jcourantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_jcourantActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneauInfoJoueurs.setVisible(true);
        panneauInfoPartie.setVisible(true);
        initialiserPartie();
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
    
    public void initialiserPartie(){
        grilleJeu.viderGrille();
        
        String nomJ1=nomJoueur1.getText();
        Joueur J1=new Joueur(nomJ1);
        String nomJ2=nomJoueur2.getText();
        Joueur J2=new Joueur(nomJ2);
        listeJoueurs[0]=J1;
        listeJoueurs[1]=J2;
        
        attribuerCouleursAuxJoueurs();
        
        System.out.println(J1.nom+" est de couleur "+J1.couleur);
        System.out.println(J2.nom+" est de couleur "+J2.couleur);
    
        for (int i=0;i<21;i++){
            J1.ajouter_jeton(new Jeton(J1.couleur));
            J2.ajouter_jeton(new Jeton(J2.couleur));
        }
        
        Random r = new Random();
        boolean premierJoueur=r.nextBoolean();
        if (premierJoueur){
            joueurCourant=listeJoueurs[0];
        }
        else{
            joueurCourant=listeJoueurs[1];
        }   
    }
    
    public void attribuerCouleursAuxJoueurs(){
        Random r =new Random();
        boolean couleur;
        couleur=r.nextBoolean();
        if(couleur){
            listeJoueurs[0].couleur="Rouge";
            listeJoueurs[1].couleur="Jaune";
                    }
        else{
            listeJoueurs[0].couleur="Jaune";
            listeJoueurs[1].couleur="Rouge";
        
    
}
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col0;
    private javax.swing.JButton btn_col1;
    private javax.swing.JButton btn_col2;
    private javax.swing.JButton btn_col3;
    private javax.swing.JButton btn_col4;
    private javax.swing.JButton btn_col5;
    private javax.swing.JButton btn_col6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lbl_j1_couleur;
    private javax.swing.JTextField lbl_j1_nom1;
    private javax.swing.JTextField lbl_j2_couleur;
    private javax.swing.JTextField lbl_j2_nom;
    private javax.swing.JTextField lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nomJoueur1;
    private javax.swing.JTextField nomJoueur2;
    private javax.swing.JPanel panneauCreationPartie;
    private javax.swing.JPanel panneauGrille;
    private javax.swing.JPanel panneauInfoJoueurs;
    private javax.swing.JPanel panneauInfoPartie;
    // End of variables declaration//GEN-END:variables
}
