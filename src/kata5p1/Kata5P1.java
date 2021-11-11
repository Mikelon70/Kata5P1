package kata5p1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5P1 {
    private String name;
    
    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();

    }
    
    public Kata5P1(String name) {
        this.name = name;
    }
    
    
    
    private static void connect() {
        Connection conn = null;
        try {
            // parámetros de la BD
            String url = "jdbc:sqlite:Kata5.db";
            // creamos una conexión a la BD
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


    
//    public void testQuery_1() {
//        
//        Connection conn = null;
//        String sql = "SELECT * FROM PERSONAS";
//        
//        try {
//            conn = this.connect();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            
//            while (rs.next()) {
//                System.out.println(rs.getInt("Id")) + "\t"
//                        + rs.getString("Nombre") + "\t"
//                        + rs.getString("Apellidos") + "\t"
//                        + rs.getString("Departamento") + "\t");
//            }
//        } catch (SQLException ex) {
//            System.out.println("" + ex.getMessage());
//        }
//    }
//    
//    public void testQuery_2() {
//        
//        Connection conn = null;
//        String sql = "SELECT * FROM CORREOS";
//        
//        try {
//            conn = this.connect();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            
//            while (rs.next()) {
//                System.out.println(rs.getInt("Id")) + "\t"
//                        + rs.getString("Nombre") + "\t"
//                        + rs.getString("Apellidos") + "\t"
//                        + rs.getString("Departamento") + "\t");
//            }
//        } catch (SQLException ex) {
//            System.out.println("" + ex.getMessage());
//        }
//    }
//    
//    
//    
//    public void createNewDatabase() {
//        
//        Connection conn = null;
//        String url = "jdbc:sqlite:" + name;
//        try {
//            conn = DriverManager.getConnection(url);
//            if (conn != null) {
//                DatabaseMetaData meta = conn.getMetaData();
//                System.out.println("El driver es " + meta.getDriverName());
//                System.out.println("Se ha creado una nueva BD");
//            }
//        } catch (SQLException ex) {
//            System.out.println("" + ex.getMessage());
//        } finally {
//            close(conn);
//        }
//    }
//    
//    public void createNewTable() {
//        Connection conn = null;
//        String sql = "CREATE TABLE IF NOT EXISTS CORREOS (\n"
//                + " Id integer PRIMARY KEY AUTOINCREMENT, \n"
//                + " Direciion text NOT NULL);";
//        try {
//            conn = this.connect();
//            Statement stmt = conn.createStatement();
//            stmt.execute(sql);
//        } catch (SQLException ex) {
//            System.out.println("" + ex.getMessage());
//        } finally {
//            close(conn);
//        }
//    }
//    
//    public void insertData(String email) {
//        
//        Connection conn = null;
//        String sql = "INSERT INTO CORREOS (Direccion) VALUES (?)"
//                
//        try {
//            conn = this.connect();
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, email);
//            pstmt.executeUpdate();
//        } catch (SQLException ex) {
//            System.out.println("" + ex.getMessage());
//        } finally {
//            close(conn);
//        }
//    }
    
}
