
package Forms;

import Classes.Adherent;
import Classes.Auteur;
import Classes.Genre;
import Classes.Fonctions;
import Classes.Livre;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abdel
 */
public class AjouterLivre extends javax.swing.JFrame {
    Fonctions f = new Fonctions();    
    Livre livre = new Livre();
    Genre genre = new Genre();
    String ImagePath = null;
    HashMap<String, Integer> mapTh = genre.getGenreMap();
    /**
     * Creates new form Genres
     */
    public AjouterLivre() {
        initComponents();
        f.DisplayIcon(45, 40, null, "/Images/CloseIcon.png", jLabelClose);
        f.DisplayIcon(90, 80, null, "/Images/book.png", jLabelTitre);
        this.setLocationRelativeTo(null);

        RemplirComboGenres();
        jLabelError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jTextFieldTitre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAnnee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPrix = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonAnnuler = new javax.swing.JButton();
        jSpinnerNmExmp = new javax.swing.JSpinner();
        jSpinnerNmPages = new javax.swing.JSpinner();
        jTextFieldLang = new javax.swing.JTextField();
        jDateChooserDate = new com.toedter.calendar.JDateChooser();
        jTextFieldEmpt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jComboBoxTheme = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldAut = new javax.swing.JTextField();
        jButtonIAut = new javax.swing.JButton();
        jButtonImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(205, 222, 255));

        jLabelTitre.setBackground(new java.awt.Color(205, 222, 255));
        jLabelTitre.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelTitre.setForeground(new java.awt.Color(103, 111, 163));
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Ajouter livre");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldTitre.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldTitre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTitreMouseClicked(evt);
            }
        });
        jTextFieldTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Titre :");

        jTextFieldAnnee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldAnnee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAnneeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Langue :");

        jTextFieldISBN.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldISBNMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("ISBN :");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Nombre exemplaires :");

        jButtonAdd.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonAdd.setText("Ajouter");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Année :");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Nombre des page :");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Image :");

        jLabelImage.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabelImage.setForeground(java.awt.Color.blue);
        jLabelImage.setText("Choisir une photo de profil....");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Description :");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Date d'achat");

        jTextFieldPrix.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldPrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPrixMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("Prix");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Auteur :");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("Théme :");

        jButtonAnnuler.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jTextFieldLang.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldLang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldLangMouseClicked(evt);
            }
        });

        jTextFieldEmpt.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldEmpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEmptMouseClicked(evt);
            }
        });
        jTextFieldEmpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmptActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setText("Emprunt :");

        jLabelError.setForeground(new java.awt.Color(255, 51, 51));
        jLabelError.setText("* Error Message");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldAut.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextFieldAut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAutMouseClicked(evt);
            }
        });
        jTextFieldAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutActionPerformed(evt);
            }
        });

        jButtonIAut.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonIAut.setText("Auteur");
        jButtonIAut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIAutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jTextFieldAut, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIAut, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldAut))
                    .addComponent(jButtonIAut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jButtonImage.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButtonImage.setText("Choisir");
        jButtonImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageActionPerformed(evt);
            }
        });

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(117, 117, 117)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldTitre)
                                        .addComponent(jTextFieldISBN)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel5)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldAnnee)
                                        .addComponent(jSpinnerNmExmp)
                                        .addComponent(jSpinnerNmPages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                        .addComponent(jTextFieldLang, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldPrix)
                                        .addComponent(jDateChooserDate, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
                                .addComponent(jLabel12))
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jButtonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addComponent(jComboBoxTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1)
                                            .addComponent(jTextFieldEmpt, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel4))
                    .addComponent(jComboBoxTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldEmpt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerNmPages, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSpinnerNmExmp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooserDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelImage)
                            .addComponent(jButtonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutActionPerformed

    private void jTextFieldAutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutMouseClicked

    private void jTextFieldPrixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPrixMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrixMouseClicked

    private void jButtonImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageActionPerformed
        // TODO add your handling code here:
        
        String Path = f.selectImage();
        jLabelImage.setText(Path);
        ImagePath = Path;
    }//GEN-LAST:event_jButtonImageActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:

        String isbn = jTextFieldISBN.getText();
        String titre = jTextFieldTitre.getText();
        String langue = jTextFieldLang.getText();
        int annee = Integer.parseInt(jTextFieldAnnee.getText());
        int nb_pages = Integer.parseInt(jSpinnerNmPages.getValue().toString());
        int nb_exmpl = Integer.parseInt(jSpinnerNmPages.getValue().toString());
        double prix = Double.parseDouble(jTextFieldPrix.getText());
   
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(jDateChooserDate.getDate());
        
        String desc = jTextAreaDesc.getText();
        int theme = jComboBoxTheme.getSelectedIndex()+1;
       // int auteur = Integer.parseInt(jTextFieldAut.getText());
        int emprunt = Integer.parseInt(jTextFieldEmpt.getText());
        
        if(isbn.isEmpty()){
            jLabelError.setVisible(true);
        }
        else if(titre.isEmpty()){
            jLabelError.setVisible(true);
        }
        else{
            byte[] img = null;

            if(ImagePath != null){
                try {
                    Path path = Paths.get(ImagePath);
                    img = Files.readAllBytes(path);
                    
                    livre.Ajouter(theme, isbn, titre, langue, annee, nb_pages, nb_exmpl, prix, date, desc, img);
                    jTextFieldTitre.setText("");
                    jTextFieldAnnee.setText("");
                    jTextFieldISBN.setText("");
                } catch (IOException ex) {
                    Logger.getLogger(AjouterLivre.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldISBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldISBNMouseClicked
        // TODO add your handling code here:
        jLabelError.setVisible(false);
    }//GEN-LAST:event_jTextFieldISBNMouseClicked

    private void jTextFieldAnneeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAnneeMouseClicked
        // TODO add your handling code here:
        jLabelError.setVisible(false);
    }//GEN-LAST:event_jTextFieldAnneeMouseClicked

    private void jTextFieldTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitreActionPerformed
        // TODO add your handling code here:
        jLabelError.setVisible(false);
    }//GEN-LAST:event_jTextFieldTitreActionPerformed

    private void jTextFieldTitreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTitreMouseClicked
        // TODO add your handling code here:
        jLabelError.setVisible(false);
    }//GEN-LAST:event_jTextFieldTitreMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldEmptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmptMouseClicked

    private void jTextFieldEmptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmptActionPerformed

    private void jButtonIAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIAutActionPerformed
        // TODO add your handling code here:
        SelectAuteur la = new SelectAuteur();
        la.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButtonIAutActionPerformed

    private void jTextFieldLangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldLangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLangMouseClicked

    public static void RemplirTextFieldAut(Integer id, String nomComplet){
        jTextFieldAut.setText(id+"-"+nomComplet);
    }
    
    public void RemplirComboGenres(){
        for(String s : mapTh.keySet()){
            jComboBoxTheme.addItem(s);
        }
    }
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
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new AjouterLivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonIAut;
    private javax.swing.JButton jButtonImage;
    private javax.swing.JComboBox<String> jComboBoxTheme;
    private com.toedter.calendar.JDateChooser jDateChooserDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerNmExmp;
    private javax.swing.JSpinner jSpinnerNmPages;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextFieldAnnee;
    public static javax.swing.JTextField jTextFieldAut;
    private javax.swing.JTextField jTextFieldEmpt;
    public static javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldLang;
    private javax.swing.JTextField jTextFieldPrix;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables

}
