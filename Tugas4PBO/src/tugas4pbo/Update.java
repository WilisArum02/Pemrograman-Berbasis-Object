package tugas4pbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arumanis
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Dosen";
    static final String USER = "postgres";
    static final String PASS = "123";
    static final String QUERY = "update dosen\n" +
                        "set alamat = 'Surabaya'\n" +
                        "where nidn = '12678'";

    

    public static void main(String[] args) {
        // Open a connection
        try ( Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);  
                Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values

                System.out.println("nidn: " + String.valueOf(rs.getObject(1)));
                System.out.println("nama: " + String.valueOf(rs.getObject(2)));
                System.out.println("alamat: " + String.valueOf(rs.getObject(3)));
                System.out.println("jenis_kelamin: " + String.valueOf(rs.getObject(4)));
                System.out.println("                                          ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
