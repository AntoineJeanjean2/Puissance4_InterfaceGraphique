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
    Joueur[] listeJoueurs = new Joueur[2];
    Grille grilleJeu = new Grille();
    Joueur joueurCourant;

    public fenetreDeJeu() {
        initComponents();
        panneauInfoJoueurs.setVisible(false);
        panneauInfoPartie.setVisible(false);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.Cellules[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }
                        if (c.jetonCourant.couleur.equals(joueurCourant.couleur)) {
                            message.setText("Le joueur " + joueurCourant.nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouter_jeton(jrecup);
                            prochainJoueur();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                message.setText("Le joueur " + joueurCourant.nom + " désintègre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                prochainJoueur();
                            } else {
                                return;
                            }
                        }
                        grilleJeu.tasserGrille();
                        
                        if (grilleJeu.colonneRemplie(0)==false){  //Cette suite de if permet de tester si à la suite d'un désintégration ou d'une récupération
                            btn_col0.setEnabled(true);            // de jeton, une colonne précedemment remplie n'a pas de nouveau une place disponible
                        }                                         //Si c'est le cas, on réactive le bouton correspondant à cette colonne afin de pouvoir y
                        if (grilleJeu.colonneRemplie(1)==false){  // replacer de nouveau un jeton
                            btn_col1.setEnabled(true);
                        }
                        if (grilleJeu.colonneRemplie(2)==false){
                            btn_col2.setEnabled(true);
                        }
                        if (grilleJeu.colonneRemplie(3)==false){
                            btn_col3.setEnabled(true);
                        }
                        if (grilleJeu.colonneRemplie(4)==false){
                            btn_col4.setEnabled(true);
                        }
                        if (grilleJeu.colonneRemplie(5)==false){
                            btn_col5.setEnabled(true);
                        }
                        if (grilleJeu.colonneRemplie(6)==false){
                            btn_col6.setEnabled(true);
                        }
                        
                        panneauGrille.repaint();
                        lbl_nb_desint_j1.setText(listeJoueurs[0].nombreDesintegrateurs + "");
                        lbl_nb_desint_j2.setText(listeJoueurs[1].nombreDesintegrateurs + "");

                        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(listeJoueurs[0]);
                        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(listeJoueurs[1]);

                        if (vict_j1 == true && vict_j2 == false) {
                            message.setText("Le Joueur " + listeJoueurs[0].nom + " a gagné !!!");
                        }
                        if (vict_j2 == true && vict_j1 == false) {
                            message.setText("Le Joueur " + listeJoueurs[1].nom + " a gagné !!!");
                        }
                        if (vict_j2 == true && vict_j1 == true) {
                            if (joueurCourant == listeJoueurs[0]) {
                                message.setText("Le joueur " + listeJoueurs[1].nom + " a gagné !!! (faute de jeu de l'autre joueur)");
                            } else {
                                message.setText("Le joueur " + listeJoueurs[0].nom + " a gagné !!! (faute de jeu de l'autre joueur)");
                            }
                        }

                    }

                });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        lbl_jcourant = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_nb_desint_j1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_nb_desint_j2 = new javax.swing.JLabel();
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

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneauInfoPartie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 60));

        lbl_jcourant.setText("nomJoueurCourant");
        panneauInfoPartie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

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
        panneauInfoJoueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneauInfoJoueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setText("Couleur :");
        panneauInfoJoueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setText("Joueur 2 :");
        panneauInfoJoueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        panneauInfoJoueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 20));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneauInfoJoueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        lbl_j1_nom.setText("nomJoueur1");
        panneauInfoJoueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneauInfoJoueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        lbl_j2_nom.setText("nomJoueur2");
        panneauInfoJoueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel10.setText("Nombre Désintégrateurs :");
        panneauInfoJoueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lbl_nb_desint_j1.setText("nbDesintJ1");
        panneauInfoJoueurs.add(lbl_nb_desint_j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel12.setText("Nombre Désintégrateurs :");
        panneauInfoJoueurs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbl_nb_desint_j2.setText("nbDesintJ2");
        panneauInfoJoueurs.add(lbl_nb_desint_j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        getContentPane().add(panneauInfoJoueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 290, 240));

        btn_col0.setText("1");
        btn_col0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn_col1.setText("2");
        btn_col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, -1, -1));

        btn_col2.setText("3");
        btn_col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 10, -1, -1));

        btn_col3.setText("4");
        btn_col3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, -1, -1));

        btn_col4.setText("5");
        btn_col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 10, -1, -1));

        btn_col5.setText("6");
        btn_col5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btn_col6.setText("7");
        btn_col6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 10, -1, -1));

        setBounds(0, 0, 1044, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void nomJoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomJoueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomJoueur2ActionPerformed

    private void btn_col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col4ActionPerformed
        jouerDansColonne(4);
        if (grilleJeu.colonneRemplie(4) == true) {
            btn_col4.setEnabled(false);
        }
        prochainJoueur();


    }//GEN-LAST:event_btn_col4ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneauInfoJoueurs.setVisible(true);
        panneauInfoPartie.setVisible(true);
        initialiserPartie();
        panneauGrille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed


    private void btn_col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col1ActionPerformed
        jouerDansColonne(1);
        if (grilleJeu.colonneRemplie(1) == true) {
            btn_col1.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col1ActionPerformed

    private void btn_col0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col0ActionPerformed
        jouerDansColonne(0);
        if (grilleJeu.colonneRemplie(0) == true) {
            btn_col0.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col0ActionPerformed

    private void btn_col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col2ActionPerformed
        jouerDansColonne(2);
        if (grilleJeu.colonneRemplie(2) == true) {
            btn_col2.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col2ActionPerformed

    private void btn_col3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col3ActionPerformed
        jouerDansColonne(3);
        if (grilleJeu.colonneRemplie(3) == true) {
            btn_col3.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col3ActionPerformed

    private void btn_col5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col5ActionPerformed
        jouerDansColonne(5);
        if (grilleJeu.colonneRemplie(5) == true) {
            btn_col5.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col5ActionPerformed

    private void btn_col6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col6ActionPerformed
        jouerDansColonne(6);
        if (grilleJeu.colonneRemplie(6) == true) {
            btn_col6.setEnabled(false);
        }
        prochainJoueur();
    }//GEN-LAST:event_btn_col6ActionPerformed

    public boolean jouerDansColonne(int indiceColonne) {

        boolean jetonAposer;
        jetonAposer = grilleJeu.ajouterJetonDansColonne(joueurCourant, joueurCourant.listeJetons[joueurCourant.nombreJetonsRestants - 1], indiceColonne);
        panneauGrille.repaint();

        lbl_nb_desint_j1.setText(listeJoueurs[0].nombreDesintegrateurs + "");
        lbl_nb_desint_j2.setText(listeJoueurs[1].nombreDesintegrateurs + "");
        
        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(listeJoueurs[0]);
        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(listeJoueurs[1]);
        
        if (vict_j1 == true && vict_j2 == false) {   //Quand la partie se termine, on affiche le vainqueur, et on désactive les boutons pour placer des jetons
            btn_col0.setEnabled(false);
            btn_col1.setEnabled(false);
            btn_col2.setEnabled(false);
            btn_col3.setEnabled(false);
            btn_col4.setEnabled(false);
            btn_col5.setEnabled(false);
            btn_col6.setEnabled(false);
            message.setText("Le Joueur " + listeJoueurs[0].nom + " a gagné !!!");
        }
        if (vict_j2 == true && vict_j1 == false) {
            btn_col0.setEnabled(false);
            btn_col1.setEnabled(false);
            btn_col2.setEnabled(false);
            btn_col3.setEnabled(false);
            btn_col4.setEnabled(false);
            btn_col5.setEnabled(false);
            btn_col6.setEnabled(false);
            message.setText("Le Joueur " + listeJoueurs[1].nom + " a gagné !!!");
        }

        if (vict_j2 == true && vict_j1 == true) {
            btn_col0.setEnabled(false);
            btn_col1.setEnabled(false);
            btn_col2.setEnabled(false);
            btn_col3.setEnabled(false);
            btn_col4.setEnabled(false);
            btn_col5.setEnabled(false);
            btn_col6.setEnabled(false);
            if (joueurCourant == listeJoueurs[0]) {
                message.setText("Le joueur " + listeJoueurs[1].nom + " a gagné !!! (faute de jeu de l'autre joueur)");
            } else {
                message.setText("Le joueur " + listeJoueurs[0].nom + " a gagné !!! (faute de jeu de l'autre joueur)");
            }
        }

        if (jetonAposer == true) {
            return true;
        } else {
            return false;
        }

    }

    public void prochainJoueur() {
        if (listeJoueurs[0] == joueurCourant) {
            joueurCourant = listeJoueurs[1];

        } else {
            joueurCourant = listeJoueurs[0];
        }
        lbl_jcourant.setText(joueurCourant.nom);
    }

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

    public void initialiserPartie() {
        grilleJeu.viderGrille();

        String nomJ1 = nomJoueur1.getText();
        Joueur J1 = new Joueur(nomJ1);
        String nomJ2 = nomJoueur2.getText();
        Joueur J2 = new Joueur(nomJ2);
        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.nom + " est de couleur " + J1.couleur);
        System.out.println(J2.nom + " est de couleur " + J2.couleur);

        lbl_j1_nom.setText(nomJ1);
        lbl_j2_nom.setText(nomJ2);
        lbl_j1_couleur.setText(J1.couleur);
        lbl_j2_couleur.setText(J2.couleur);

        lbl_nb_desint_j1.setText(J1.nombreDesintegrateurs + "");
        lbl_nb_desint_j2.setText(J1.nombreDesintegrateurs + "");

        for (int i = 0; i < 21; i++) {
            J1.ajouter_jeton(new Jeton(J1.couleur));
            J2.ajouter_jeton(new Jeton(J2.couleur));
        }

        Random r = new Random();
        boolean premierJoueur = r.nextBoolean();
        if (premierJoueur) {
            joueurCourant = listeJoueurs[0];
        } else {
            joueurCourant = listeJoueurs[1];
        }
        lbl_jcourant.setText(joueurCourant.nom);

        Random r2 = new Random();
        int ligne;
        int colonne;
        for (int i = 0; i < 6; i++) {
            ligne = r2.nextInt(6);
            colonne = r2.nextInt(7);
            if (grilleJeu.Cellules[ligne][colonne].desintegrateur == false) {
                grilleJeu.placerDesintegrateur(ligne, colonne);
            }
        }
    }

    public void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            listeJoueurs[0].couleur = "Rouge";
            listeJoueurs[1].couleur = "Jaune";
        } else {
            listeJoueurs[0].couleur = "Jaune";
            listeJoueurs[1].couleur = "Rouge";

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JLabel lbl_nb_desint_j1;
    private javax.swing.JLabel lbl_nb_desint_j2;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nomJoueur1;
    private javax.swing.JTextField nomJoueur2;
    private javax.swing.JPanel panneauCreationPartie;
    private javax.swing.JPanel panneauGrille;
    private javax.swing.JPanel panneauInfoJoueurs;
    private javax.swing.JPanel panneauInfoPartie;
    // End of variables declaration//GEN-END:variables
}
