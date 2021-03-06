
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbissari
 */
public class Accueil extends javax.swing.JPanel {
    
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNouvellePartie = new javax.swing.JButton();
        jbOptions = new javax.swing.JButton();
        jbRegles = new javax.swing.JButton();
        jbQuitter = new javax.swing.JButton();
        jbChargerPartie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jbNouvellePartie.setText("Nouvelle partie");
        jbNouvellePartie.setToolTipText("Commencer une nouvelle partie");
        jbNouvellePartie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNouvellePartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNouvellePartieActionPerformed(evt);
            }
        });
        add(jbNouvellePartie);
        jbNouvellePartie.setBounds(362, 227, 170, 29);

        jbOptions.setText("Options");
        jbOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOptionsActionPerformed(evt);
            }
        });
        add(jbOptions);
        jbOptions.setBounds(362, 321, 170, 29);

        jbRegles.setText("Les règles du jeu");
        jbRegles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReglesActionPerformed(evt);
            }
        });
        add(jbRegles);
        jbRegles.setBounds(362, 368, 170, 29);

        jbQuitter.setText("Quitter");
        jbQuitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitterActionPerformed(evt);
            }
        });
        add(jbQuitter);
        jbQuitter.setBounds(362, 415, 170, 29);

        jbChargerPartie.setText("Charger une partie");
        jbChargerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChargerPartieActionPerformed(evt);
            }
        });
        add(jbChargerPartie);
        jbChargerPartie.setBounds(362, 274, 170, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeBg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(850, 650));
        jLabel1.setMinimumSize(new java.awt.Dimension(850, 650));
        jLabel1.setPreferredSize(new java.awt.Dimension(850, 650));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNouvellePartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNouvellePartieActionPerformed
        setVisible(false);
        Lanceur.f.add(new Jeu());
    }//GEN-LAST:event_jbNouvellePartieActionPerformed

    private void jbOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOptionsActionPerformed
        setVisible(false);
        Lanceur.f.add(new Options());
    }//GEN-LAST:event_jbOptionsActionPerformed

    private void jbReglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReglesActionPerformed
        setVisible(false);
        Lanceur.f.add(new Regles());
    }//GEN-LAST:event_jbReglesActionPerformed

    private void jbQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitterActionPerformed
        Lanceur.f.setVisible(false);
        Lanceur.f.dispose();
    }//GEN-LAST:event_jbQuitterActionPerformed

    private void jbChargerPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChargerPartieActionPerformed
        LoadSave load =new LoadSave();
        try {
             setVisible(false);
        Lanceur.f.add(new Jeu(load.load()));
           System.out.println(load.load());
        } catch (IOException ex) {
            Logger.getLogger(MenuJeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbChargerPartieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbChargerPartie;
    private javax.swing.JButton jbNouvellePartie;
    private javax.swing.JButton jbOptions;
    private javax.swing.JButton jbQuitter;
    private javax.swing.JButton jbRegles;
    // End of variables declaration//GEN-END:variables
}
