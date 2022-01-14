/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class Adherent {

    private int id;
    private String cne;
    private String nom;
    private String prenom;
    private String dateNaiss;
    private String email;
    private String tel;
    private byte sexe;
    private byte[] image;

    public Adherent(int id, String cne, String nom, String prenom, String dateNaiss, String email, String tel, byte sexe, byte[] image) {
        this.id = id;
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.email = email;
        this.tel = tel;
        this.sexe = sexe;
        this.image = image;
    }

    public Adherent() {
    }

    public int getId() {
        return id;
    }

    public String getCne() {
        return cne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public byte getSexe() {
        return sexe;
    }

    public byte[] getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSexe(byte sexe) {
        this.sexe = sexe;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    PreparedStatement ps;
    ResultSet rs;
    Fonctions f = new Fonctions();

    public void Ajouter(String cne, String nom, String prenom, String date, String email, String tel, byte sexe, byte[] img) {
        try {
            String req = "INSERT INTO `adherent` (`CNEADHR`, `NOMADHR`, `PRENOMADHR`, `DATENAISSADHR`,"
                    + " `EMAILADHR`, `TELADHR`, `SEXEADHR`, `IMAGEADHR`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            ps = DB.getConnection().prepareStatement(req);
            ps.setString(1, cne);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setString(4, date);
            ps.setString(5, email);
            ps.setString(6, tel);
            ps.setByte(7, sexe);
            ps.setBytes(8, img);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Ajouter adherent avec succces", "Ajouter", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Adherent n'est pas ajouter", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modifier(String cne, String nom, String prenom, String date, String email, String tel, byte sexe, byte[] img) {
        try {

            String reqU = "UPDATE `gestionbiblio`.`adherent` SET `NOMADHR`=?, `PRENOMADHR`=?, `DATENAISSADHR`=?,"
                    + " `EMAILADHR`=?, `TELADHR`=?, `SEXEADHR`=?, `IMAGEADHR`=? WHERE `CNEADHR`=?;";

            ps = DB.getConnection().prepareStatement(reqU);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, date);
            ps.setString(4, email);
            ps.setString(5, tel);
            ps.setByte(6, sexe);
            ps.setBytes(7, img);
            ps.setString(8, cne);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Modifie adherent avec succces", "Modifier", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Adherent n'est pas modifie", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Supprimer(String cne_idA, String s) {

        try {
            String reqS = "DELETE FROM `adherent` WHERE  `" + s + "`=?;";

            ps = DB.getConnection().prepareStatement(reqS);
            ps.setString(1, cne_idA);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Supprime adherent avec succces", "Supprimer", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Adherent n'est pas supprime", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Adherent getAdherentById(String cne, int idAhr) {
        Adherent aut = null;
        String req = "SELECT * FROM `adherent` WHERE CNEADHR = '" + cne + "';";

        if (cne == null) {
            req = "SELECT * FROM `adherent` WHERE ID_ADHERENT = '" + idAhr + "';";
        }

        ResultSet rs = f.getData(req);

        if (rs != null) {

            try {
                while (rs.next()) {
                    aut = new Adherent(rs.getInt("ID_ADHERENT"), rs.getString("CNEADHR"), rs.getString("NOMADHR"),
                            rs.getString("PRENOMADHR"), rs.getString("DATENAISSADHR"), rs.getString("EMAILADHR"),
                            rs.getString("TELADHR"), rs.getByte("SEXEADHR"), rs.getBytes("IMAGEADHR"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "l'adherent n'existe pas", "Attention", 2);
        }
        return aut;
    }

    public ArrayList<Adherent> Afficher(String req) {
        ArrayList<Adherent> list = new ArrayList<>();
        String r = "SELECT * FROM `adherent`;";

        try {

            if (req.equals("")) {
                rs = f.getData(r);
            } else {
                rs = f.getData(req);
            }

            if (rs != null) {

                while (rs.next()) {
                    Adherent aut = new Adherent(rs.getInt("ID_ADHERENT"), rs.getString("CNEADHR"), rs.getString("NOMADHR"),
                            rs.getString("PRENOMADHR"), rs.getString("DATENAISSADHR"), rs.getString("EMAILADHR"),
                            rs.getString("TELADHR"), rs.getByte("SEXEADHR"), rs.getBytes("IMAGEADHR"));
                    list.add(aut);
                }
            } else {
                JOptionPane.showMessageDialog(null, "la liste des adherents est vide", "Attention", 2);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
}
