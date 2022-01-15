package Forms;

import Classes.Adherent;
import Classes.Emprunter;
import Classes.Fonctions;
import Classes.Livre;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class EmpruntLivre extends javax.swing.JFrame {

    Fonctions f = new Fonctions();
    Livre livre = new Livre();
    Adherent adherent = new Adherent();
    Emprunter emprunter = new Emprunter();

    /**
     * Creates new form Genres
     */
    public EmpruntLivre() {
        initComponents();
        f.DisplayIcon(45, 40, null, "/Images/CloseIcon.png", jLabelClose);
        f.DisplayIcon(90, 80, null, "/Images/EmpBook.png", jLabelTitre);
        this.setLocationRelativeTo(null);

        jDateChooserDateEmp.setDate(new Date());
        jDateChooserDateRetour.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonRchAdh = new javax.swing.JButton();
        jDateChooserDateRetour = new com.toedter.calendar.JDateChooser();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonRchLv = new javax.swing.JButton();
        jLabelLvInfo = new javax.swing.JLabel();
        jLabelAdhInfo = new javax.swing.JLabel();
        jLabelOuiNon = new javax.swing.JLabel();
        jDateChooserDateEmp = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jSpinnerAdhID = new javax.swing.JSpinner();
        jSpinnerLvID = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObser = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(205, 222, 255));

        jLabelTitre.setBackground(new java.awt.Color(205, 222, 255));
        jLabelTitre.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelTitre.setForeground(new java.awt.Color(103, 111, 163));
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Emprunter un livre");
        jLabelTitre.setOpaque(true);

        jLabelClose.setBackground(new java.awt.Color(205, 222, 255));
        jLabelClose.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(103, 111, 163));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.setOpaque(true);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Sélectionner l'id de l'adherent :");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Sélectionner l'id de livre  :");

        jButtonAdd.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonAdd.setText("Ajouter");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Le livre est-il disponible :");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Date de retour :");

        jButtonRchAdh.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonRchAdh.setText("Rechercher");
        jButtonRchAdh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRchAdh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRchAdhActionPerformed(evt);
            }
        });

        jButtonAnnuler.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jButtonRchLv.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonRchLv.setText("Rechercher");
        jButtonRchLv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRchLv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRchLvActionPerformed(evt);
            }
        });

        jLabelLvInfo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelLvInfo.setForeground(new java.awt.Color(51, 51, 255));
        jLabelLvInfo.setText("Livre informations");
        jLabelLvInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLvInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLvInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLvInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLvInfoMouseExited(evt);
            }
        });

        jLabelAdhInfo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelAdhInfo.setForeground(new java.awt.Color(51, 51, 255));
        jLabelAdhInfo.setText("Adherent informations");
        jLabelAdhInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdhInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdhInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAdhInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAdhInfoMouseExited(evt);
            }
        });

        jLabelOuiNon.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelOuiNon.setForeground(new java.awt.Color(51, 51, 255));
        jLabelOuiNon.setText("OUI ou Non");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Date d'émission :");

        jTextAreaObser.setColumns(20);
        jTextAreaObser.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextAreaObser.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObser);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("Observation :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSpinnerLvID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinnerAdhID, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelLvInfo)
                                                        .addComponent(jLabelAdhInfo)
                                                        .addComponent(jLabelOuiNon))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonRchLv, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonRchAdh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jDateChooserDateEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooserDateRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonRchLv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLvID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLvInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonRchAdh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAdhID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAdhInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelOuiNon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRchLvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRchLvActionPerformed
        // TODO add your handling code here:
        int idL = Integer.parseInt(jSpinnerLvID.getValue().toString());

        Livre l = livre.getLivreById(idL, null);
        if (l != null) {
            jLabelLvInfo.setText(l.getTitre());

            if (emprunter.CheckDispoLivre(idL)) {
                jLabelOuiNon.setText("Oui");
                jLabelOuiNon.setForeground(Color.green);
            } else {
                jLabelOuiNon.setText("Non");
                jLabelOuiNon.setForeground(Color.red);
            }
        } else {
            jLabelLvInfo.setText("Livre informations");
            JOptionPane.showMessageDialog(null, "Le livre que vous recherche n'existe pas", "Attention", 2);
        }
    }//GEN-LAST:event_jButtonRchLvActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonRchAdhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRchAdhActionPerformed
        // TODO add your handling code here:
        int idAdh = Integer.parseInt(jSpinnerAdhID.getValue().toString());

        Adherent a = adherent.getAdherentById(null, idAdh);
        if (a != null) {
            jLabelAdhInfo.setText(a.getNom() + " " + a.getPrenom());
        } else {
            jLabelAdhInfo.setText("Adherent informations");
            JOptionPane.showMessageDialog(null, "L'adherent que vous recherche n'existe pas", "Attention", 2);
        }
    }//GEN-LAST:event_jButtonRchAdhActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            // TODO add your handling code here:
            int idL = (int) jSpinnerLvID.getValue();
            int idAdh = (int) jSpinnerAdhID.getValue();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateE = dateFormat.format(jDateChooserDateEmp.getDate());
            String dateR = dateFormat.format(jDateChooserDateRetour.getDate());
            String obser = jTextAreaObser.getText();
            Date dE = dateFormat.parse(dateE);
            Date dR = dateFormat.parse(dateR);

            if (dR.before(dE)) {

                JOptionPane.showMessageDialog(null, "La date de retour doit apres la date d'emprunt !!!!", "Attention", 2);
            } else if (jLabelOuiNon.getText().equals("Non")) {

                JOptionPane.showMessageDialog(null, "Ce livre n'est pas disponible !!!!", "Attention", 2);
            } else {

                emprunter.Ajouter(idL, idAdh, "Rendue", dateE, dateR, obser);
            }

        } catch (ParseException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelLvInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLvInfoMouseEntered
        // TODO add your handling code here:
        f.setBorderToJLabel(new Color(51, 51, 255), jLabelLvInfo);
    }//GEN-LAST:event_jLabelLvInfoMouseEntered

    private void jLabelLvInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLvInfoMouseExited
        // TODO add your handling code here:
        f.setBorderToJLabel(Color.WHITE, jLabelLvInfo);
    }//GEN-LAST:event_jLabelLvInfoMouseExited

    private void jLabelAdhInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdhInfoMouseEntered
        // TODO add your handling code here:
        f.setBorderToJLabel(new Color(51, 51, 255), jLabelAdhInfo);
    }//GEN-LAST:event_jLabelAdhInfoMouseEntered

    private void jLabelAdhInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdhInfoMouseExited
        // TODO add your handling code here:
        f.setBorderToJLabel(Color.WHITE, jLabelAdhInfo);
    }//GEN-LAST:event_jLabelAdhInfoMouseExited

    public static String typeInfo = "";
    public static int idLv;
    public static int idAdhr;
    private void jLabelLvInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLvInfoMouseClicked
        // TODO add your handling code here:
        typeInfo = "Livre";

        idLv = (int) jSpinnerLvID.getValue();

        if (jLabelLvInfo.getText().equals("Livre informations")) {

            JOptionPane.showMessageDialog(null, "Le livre que vous recherche n'existe pas", "Attention", 2);
        } else {
            Informations i = new Informations();
            i.setVisible(true);
        }
    }//GEN-LAST:event_jLabelLvInfoMouseClicked

    private void jLabelAdhInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdhInfoMouseClicked
        // TODO add your handling code here:
        typeInfo = "Adherent";
        idAdhr = (int) jSpinnerAdhID.getValue();

        if (jLabelAdhInfo.getText().equals("Adherent informations")) {

            JOptionPane.showMessageDialog(null, "L'adherent que vous recherche n'existe pas", "Attention", 2);
        } else {
            Informations i = new Informations();
            i.setVisible(true);
        }
    }//GEN-LAST:event_jLabelAdhInfoMouseClicked

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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpruntLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpruntLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpruntLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpruntLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpruntLivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonRchAdh;
    private javax.swing.JButton jButtonRchLv;
    private com.toedter.calendar.JDateChooser jDateChooserDateEmp;
    private com.toedter.calendar.JDateChooser jDateChooserDateRetour;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAdhInfo;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLvInfo;
    private javax.swing.JLabel jLabelOuiNon;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAdhID;
    private javax.swing.JSpinner jSpinnerLvID;
    private javax.swing.JTextArea jTextAreaObser;
    // End of variables declaration//GEN-END:variables

}
