/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class Livre {
    
    private int idL;
    private String isbn;
    private String titre;
    private String langue;
    private int annee;
    private int nbr_pages;
    private int nbr_exemp;
    private double prix;
    private Date date_achat;
    private String desc;
    private byte[] image;
    private int theme;
    private int emprunt;
    private int auteur;

    public Livre(int idL, String isbn, String titre, String langue, int annee, int nbr_pages, int nbr_exemp, double prix, Date date_achat, String desc, byte[] image, int theme, int emprunt, int auteur) {
        this.idL = idL;
        this.isbn = isbn;
        this.titre = titre;
        this.langue = langue;
        this.annee = annee;
        this.nbr_pages = nbr_pages;
        this.nbr_exemp = nbr_exemp;
        this.prix = prix;
        this.date_achat = date_achat;
        this.desc = desc;
        this.image = image;
        this.theme = theme;
        this.emprunt = emprunt;
        this.auteur = auteur;
    }

    public Livre() {
    }

    public int getIdL() {
        return idL;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    public int getAnnee() {
        return annee;
    }

    public int getNbr_pages() {
        return nbr_pages;
    }

    public int getNbr_exemp() {
        return nbr_exemp;
    }

    public double getPrix() {
        return prix;
    }

    public Date getDate_achat() {
        return date_achat;
    }

    public String getDesc() {
        return desc;
    }

    public byte[] getImage() {
        return image;
    }

    public int getTheme() {
        return theme;
    }

    public int getEmprunt() {
        return emprunt;
    }

    public int getAuteur() {
        return auteur;
    }

    public void setIdL(int idL) {
        this.idL = idL;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setNbr_pages(int nbr_pages) {
        this.nbr_pages = nbr_pages;
    }

    public void setNbr_exemp(int nbr_exemp) {
        this.nbr_exemp = nbr_exemp;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDate_achat(Date date_achat) {
        this.date_achat = date_achat;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }

    public void setEmprunt(int emprunt) {
        this.emprunt = emprunt;
    }

    public void setAuteur(int auteur) {
        this.auteur = auteur;
    }
    
    PreparedStatement ps;
    ResultSet rs;
    Fonctions f = new Fonctions();
    
    public void Ajouter(int idT, String isbn, String titre, String langue, Date annee, int nb_pages, int nb_exmpl, double prix, Date date, String desc, byte[] img){
        try {
            String req = "INSERT INTO `livre` (`ID_TH`, `ISBN`, `TITRE`, `LANGUE`, `ANNEE`, `NBR_PAGES`, `NBR_EXEMP`, `PRIX`, `DATE_ACHAT`, `DESCRIPTION`, `IMAGE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            ps = DB.getConnection().prepareStatement(req);
            ps.setInt(1, idT);               
            ps.setString(2, isbn);                     
            ps.setString(3, titre);            
            ps.setString(4, langue);            
            ps.setString(5, annee.toString());
            ps.setInt(6, nb_pages);
            ps.setInt(7, nb_exmpl);
            ps.setDouble(8, prix);
            ps.setString(9, date.toString());
            ps.setString(10, desc);
            ps.setBytes(11, img);

            
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Ajouter livre avec succces", "Ajouter", 1); 
            }
            else{
                JOptionPane.showMessageDialog(null, "livre n'est pas ajouter", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "livre n'est pas ajouter", "Attention", 2);
            Logger.getLogger(Livre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
