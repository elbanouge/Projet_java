/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class Emprunter {
    private int idLv;
    private int idAdh;
    private String retour;
    private String dateE;
    private String dateR;
    private String obser;

    public Emprunter(int idLv, int idAdh, String retour, String dateE, String dateR, String obser) {
        this.idLv = idLv;
        this.idAdh = idAdh;
        this.retour = retour;
        this.dateE = dateE;
        this.dateR = dateR;
        this.obser = obser;
    }

    public Emprunter() {
    }

    public int getIdLv() {
        return idLv;
    }

    public int getIdAdh() {
        return idAdh;
    }

    public String getRetour() {
        return retour;
    }

    public String getDateE() {
        return dateE;
    }

    public String getDateR() {
        return dateR;
    }

    public String getObser() {
        return obser;
    }

    public void setIdLv(int idLv) {
        this.idLv = idLv;
    }

    public void setIdAdh(int idAdh) {
        this.idAdh = idAdh;
    }

    public void setRetour(String retour) {
        this.retour = retour;
    }

    public void setDateE(String dateE) {
        this.dateE = dateE;
    }

    public void setDateR(String dateR) {
        this.dateR = dateR;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }
        
    PreparedStatement ps;
    ResultSet rs;
    Fonctions f = new Fonctions();
    Livre l = new Livre();
    
    public void Ajouter(int idLv, int idAdh, String retour, String dateE, String dateR, String obser){
    
        try {
            String req = "INSERT INTO `gestionbiblio`.`emprunt` (`ID_LIVRE`, `ID_ADHR`, `DATE_DEBUT`, `DATE_FIN`, `RENDUE`, `NOTE`) VALUES (?, ?, ?, ?, ?, ?);";
            
            ps = DB.getConnection().prepareStatement(req);
            ps.setInt(1, idLv);               
            ps.setInt(2, idAdh);                     
            ps.setString(3, dateE);            
            ps.setString(4, dateR);            
            ps.setString(5, retour);            
            ps.setString(6, obser);
            
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Ajouter emprunte avec succces", "Ajouter", 1); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Emprunt livre n'est pas ajouter", "Attention", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Emprunt livre n'est pas ajouter", "Attention", 2);
            Logger.getLogger(Livre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean CheckDispoLivre(){
        boolean b = false;
        
        try {
            
            Livre livre = l.getLivreById(idLv);
            int qty = l.getNbr_exemp();
            int qtyEmp = countData(idLv);
            
            if(qty > qtyEmp){
                
                b = true;
            }
            else{
                
                b = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Emprunter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }
    
    public int countData(int idLv){        
        int total = 0;
 
        try {            
            String req = "SELECT Count(*) as total from `emprunt` WHERE ID_LIVRE = ? AND RENDUE = 'rendue'";
            
            ps = DB.getConnection().prepareStatement(req);
            ps.setInt(1, idLv);
            
            rs = ps.executeQuery(req);
           
            if(rs.next()){
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Emprunter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public ArrayList<Emprunter> Afficher(String status) {
        
        ArrayList<Emprunter> list = new ArrayList<>();
        String req = "";            

        try {

            if(status.equals("")){
                req = "SELECT * FROM `emprunt`;";
            }else{                
                req = "SELECT * FROM `emprunt` WHERE RENDUE = '"+status+"';";
            }

            rs = f.getData(req);

            if(rs != null){

                while(rs.next()){
                    Emprunter e = new Emprunter(rs.getInt("ID_LIVRE"), rs.getInt("ID_ADHR"), rs.getString("DATE_DEBUT"), rs.getString("DATE_FIN"), rs.getString("RENDUE"), rs.getString("NOTE"));
                    list.add(e);
                }
            }else{
                    JOptionPane.showMessageDialog(null, "la liste des emprunts est vide", "Attention", 2);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "la liste des emprunts est vide", "Attention", 2);
            Logger.getLogger(Auteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }    
}
