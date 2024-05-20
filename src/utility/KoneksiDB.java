package utility;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author khadamikhwan
 */
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class KoneksiDB {
    Connection konek;
    public static Connection BuatKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost/tugas_visual","root","");
            return konek;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
