/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class Genre {
    private int id;
    private String nom;

    public Genre(){}
  
    public Genre(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    PreparedStatement ps;
    ResultSet rs;
    Fonctions f = new Fonctions();
    
    public boolean Ajouter(String nom){
        try {
            String req = "INSERT INTO `theme`(LIBELLE) VALUES (?);";
            
            ps = DB.getConnection().prepareStatement(req);
            ps.setString(1, nom);
            
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Ajouter genre avec succces", "Ajouter", 1); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre n'est pas ajouter", "Attention", 1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public void Modifier(int id, String nom) {
        try {
        String reqU = "UPDATE `theme` SET `LIBELLE`= ? WHERE `ID_TH`= ?;";
            
            ps = DB.getConnection().prepareStatement(reqU);
            ps.setString(1, nom);
            ps.setInt(2, id);

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Modifie genre avec succces", "Modifier", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre n'est pas modifie", "Attention", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    public void Supprimer(int idG) {
        
        try{
            String reqS = "DELETE FROM `theme` WHERE  `ID_TH`= ?;";
        
            ps = DB.getConnection().prepareStatement(reqS);
            ps.setInt(1, idG);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Supprime genre avec succces", "Supprimer", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Genre n'est pas supprime", "Attention", 2);
            }
        }catch(SQLException exception){
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public ArrayList<Genre> Afficher(){
        ArrayList<Genre> list = new ArrayList<>();

        try {            
            String req = "SELECT * FROM `theme`";
            rs = f.getData(req);

            if(rs != null){

                while(rs.next()){
                Genre g = new Genre(rs.getInt("ID_TH"), rs.getString("LIBELLE"));
                list.add(g);
            }
            }else{
                JOptionPane.showMessageDialog(null, "la liste des theme est vide", "Attention", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    public HashMap<String, Integer> getGenreMap(){
        HashMap<String, Integer> map = new HashMap<>();

        try {            
            String req = "SELECT * FROM `theme`";
            rs = f.getData(req);

            if(rs != null){

                while(rs.next()){
                Genre g = new Genre(rs.getInt("ID_TH"), rs.getString("LIBELLE"));
                map.put(g.getNom(), g.getId());
            }
            }else{
                JOptionPane.showMessageDialog(null, "la liste des theme est vide", "Attention", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
    
}