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
public class Auteur {

    private int id;
    private String nom;
    private String prenom;
    private String dateNaiss;
    private String nat;

    public Auteur(int id, String nom, String prenom, String dateNaiss, String nat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.nat = nat;
    }

    public Auteur() {
    }

    public int getId() {
        return id;
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

    public String getNat() {
        return nat;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setNat(String nat) {
        this.nat = nat;
    }

    PreparedStatement ps;
    ResultSet rs;
    Fonctions f = new Fonctions();

    public void Ajouter(String nom, String prenom, String date, String nat) {
        try {
            String req = "INSERT INTO `auteur` (`NOMAUT`, `PRENOMAUT`, `DATENAISSAUT`, `NATIONALITEAUT`) VALUES (?, ?, ?, ?);";

            ps = DB.getConnection().prepareStatement(req);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, date);
            ps.setString(4, nat);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Ajouter auteur avec succces", "Ajouter", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Auteur n'est pas auteur", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modifier(int id, String nom, String prenom, String date, String nat) {
        try {
            String reqU = "UPDATE `auteur` SET `NOMAUT`=?, `PRENOMAUT`=?, `DATENAISSAUT`=?, `NATIONALITEAUT`=? WHERE  `ID_AUTEUR`=?;";

            ps = DB.getConnection().prepareStatement(reqU);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, date);
            ps.setString(4, nat);
            ps.setInt(5, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Modifie auteur avec succces", "Modifier", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Auteur n'est pas modifie", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Supprimer(int idA) {

        try {
            String reqS = "DELETE FROM `auteur` WHERE `ID_AUTEUR`=?;";

            ps = DB.getConnection().prepareStatement(reqS);
            ps.setInt(1, idA);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Supprime auteur avec succces", "Supprimer", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Auteur n'est pas supprime", "Attention", 2);
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Auteur> Afficher() {
        ArrayList<Auteur> list = new ArrayList<>();

        try {
            String req = "SELECT * FROM `auteur`;";
            rs = f.getData(req);

            if (rs != null) {

                while (rs.next()) {
                    Auteur aut = new Auteur(rs.getInt("ID_AUTEUR"), rs.getString("NOMAUT"), rs.getString("PRENOMAUT"), rs.getString("DATENAISSAUT"), rs.getString("NATIONALITEAUT"));
                    list.add(aut);
                }
            } else {
                JOptionPane.showMessageDialog(null, "la liste des auteur est vide", "Attention", 2);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public Auteur getAutByID(int idAut) {
        Auteur aut = null;

        try {
            String req = "SELECT * FROM `auteur` WHERE ID_AUTEUR = '" + idAut + "';";
            rs = f.getData(req);

            if (rs != null) {

                while (rs.next()) {
                    aut = new Auteur(rs.getInt("ID_AUTEUR"), rs.getString("NOMAUT"), rs.getString("PRENOMAUT"), rs.getString("DATENAISSAUT"), rs.getString("NATIONALITEAUT"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "l'auteur n'existe pas", "Attention", 2);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }
        return aut;
    }
}
