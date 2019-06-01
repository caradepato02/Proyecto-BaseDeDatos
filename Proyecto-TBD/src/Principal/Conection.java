package Principal;



import java.sql.*;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalo_
 */
public class Conection {

    private static Connection cnx = null;

    public static Connection getConnection(String user, String pass) throws SQLException, ClassNotFoundException {
        try {
            // We register the MySQL (MariaDB) driver
            // Registramos el driver de MySQL (MariaDB)
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
            
            
            // Database connect
            // Conectamos con la base de datos
            cnx =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kalorik",user, pass);
           
        } catch (java.sql.SQLException sqle) {
            System.out.println(" 10 Error: " + sqle);
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
