

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbissari
 */
public class Options extends javax.swing.JPanel {

    /**
     * Creates new form Options
     */
    public Options() {
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

        jbRetourAccueil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jsTaillePlateau = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jsTempsDecompte = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jcStylePlateau = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(850, 650));
        setPreferredSize(new java.awt.Dimension(850, 650));
        setLayout(null);

        jbRetourAccueil.setText("Retourner à l'accueil");
        jbRetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetourAccueilActionPerformed(evt);
            }
        });
        add(jbRetourAccueil);
        jbRetourAccueil.setBounds(400, 370, 129, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Taille du plateau :");
        add(jLabel1);
        jLabel1.setBounds(305, 240, 110, 15);

        jsTaillePlateau.setModel(new javax.swing.SpinnerNumberModel(Lanceur.taillePlateau, 9, 15, 2));
        jsTaillePlateau.setValue(Lanceur.taillePlateau);
        add(jsTaillePlateau);
        jsTaillePlateau.setBounds(440, 240, 92, 24);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Temps du décompte :");
        add(jLabel2);
        jLabel2.setBounds(303, 280, 130, 15);

        jsTempsDecompte.setModel(new javax.swing.SpinnerNumberModel(Lanceur.waitTimeLimit, 5, 59, 1));
        jsTempsDecompte.setValue(Lanceur.waitTimeLimit);
        add(jsTempsDecompte);
        jsTempsDecompte.setBounds(440, 280, 92, 24);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Style du plateau :");
        add(jLabel3);
        jLabel3.setBounds(305, 320, 110, 15);

        jcStylePlateau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retro", "Bloody" }));
        jcStylePlateau.setSelectedIndex(Lanceur.themeIndex);
        add(jcStylePlateau);
        jcStylePlateau.setBounds(440, 320, 92, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeBg.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.setMaximumSize(new java.awt.Dimension(850, 650));
        jLabel4.setMinimumSize(new java.awt.Dimension(850, 650));
        jLabel4.setPreferredSize(new java.awt.Dimension(850, 650));
        add(jLabel4);
        jLabel4.setBounds(0, 0, 850, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetourAccueilActionPerformed
        this.setVisible(false);
        Lanceur.taillePlateau = (int)jsTaillePlateau.getValue();
        Lanceur.waitTimeLimit = (int)jsTempsDecompte.getValue();
        Lanceur.themeIndex = jcStylePlateau.getSelectedIndex();
        Lanceur.theme = new Theme(jcStylePlateau.getItemAt(Lanceur.themeIndex).toLowerCase());
        Lanceur.f.add(new Accueil());
    }//GEN-LAST:event_jbRetourAccueilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbRetourAccueil;
    private javax.swing.JComboBox<String> jcStylePlateau;
    private javax.swing.JSpinner jsTaillePlateau;
    private javax.swing.JSpinner jsTempsDecompte;
    // End of variables declaration//GEN-END:variables
}