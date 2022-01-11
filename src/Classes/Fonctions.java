/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author abdel
 */
public class Fonctions {
    
    
    public void DisplayIcon(int width, int heigh, byte[] image, String im, JLabel label){
        ImageIcon icon;
        
        if(image != null){
            icon = new ImageIcon(image);
        }
        else{
            try{
                icon = new ImageIcon(getClass().getResource(im));
            }catch(Exception e){
                icon = new ImageIcon(im);
            }   
        }
        Image img = icon.getImage().getScaledInstance(width, heigh, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
    }
    
    public static PreparedStatement ps;
    public static Statement st;
    public static ResultSet rs;
    public ResultSet getData(String req){
        
        try {            
            ps = DB.getConnection().prepareStatement(req);
            rs = ps.executeQuery();
   
        } catch (SQLException ex) {
            Logger.getLogger(Fonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int countData(String tableName){
        int total = 0;
 
        try {            
            String req = "SELECT Count(*) as total from `"+tableName+"`";
            
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(req);
   
            if(rs.next()){
                total = rs.getInt("total");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Fonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public void customTable(JTable table){
        table.setSelectionBackground(new Color(255, 89, 89));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setBackground(new Color(248, 248, 248));
        table.setShowGrid(false);
        table.setShowHorizontalLines(true);        
        table.setGridColor(new Color(255, 89, 89));
    }
    
    public void customHeaderTable(JTable table, Color color, Integer font){
        table.getTableHeader().setBackground(color);        
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Cambria", Font.BOLD, font));
        table.getTableHeader().setOpaque(false);
 
    }
    
    public String selectImage(){
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choisir une photo de profil");
        chooser.setCurrentDirectory(new File("C:\\Images"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp");
        chooser.addChoosableFileFilter(filter);

        int fileState = chooser.showSaveDialog(null);
        
        String Path = "";
        if(fileState == JFileChooser.APPROVE_OPTION){
            Path = chooser.getSelectedFile().getAbsolutePath();
        }
        return Path;
    }
    
    public void setBorderToJLabel(Color color, JLabel label){
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(border);
    }
    
}
