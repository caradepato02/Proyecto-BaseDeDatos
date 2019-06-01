package GeneratorDatos;


import Principal.Conection;
import Principal.Kalorik;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalo_
 */
public class UserGenerator {

    private Connection conection;
    private int cant;
    private int numName;
    private int numApePat;
    private int numApeMat;
    private int dia, mes, anno;
    private int peso;
    private String telefono;
    private String nombre, apePat, apeMat;
    private String uid;
    private String user;
    private String pass;
    public UserGenerator(int cant) {

        Conection conexion = new Conection();
        this.cant = cant;
        user = "admin";
        pass = "LaMejorContrasena";
        conexion = new Conection();
        try {
            conection = conexion.getConnection(user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Kalorik.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kalorik.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 1; i < cant; i++) {

            numName = (int) (Math.random() * 3);

            switch (numName) {
                case 0:
                    nombre = "Rodrigo";
                    break;
                case 1:
                    nombre = "Alondra";
                    break;
                case 2:
                    nombre = "Diego";
                    break;
                case 3:
                    nombre = "Emiliano";
                    break;
            }
            numApePat = (int) (Math.random() * 3);

            switch (numApePat) {
                case 0:
                    apePat = "Reyes";
                    break;
                case 1:
                    apePat = "Ruiz";
                    break;
                case 2:
                    apePat = "Portillo";
                    break;
                case 3:
                    apePat = "Ituarte";
                    break;
            }

            numApeMat = (int) (Math.random() * 3);

            switch (numApeMat) {
                case 0:
                    apeMat = "Hernandez";
                    break;
                case 1:
                    apeMat = "Gonzalez";
                    break;
                case 2:
                    apeMat = "Hernandez";
                    break;
                case 3:
                    apeMat = "Sanches";
                    break;
            }

            dia = (int) (Math.random() * 28) + 1;
            mes = (int) (Math.random() * 11) + 1;
            anno = (int) (Math.random() * 48) + 1951;
            peso = (int) (Math.random() * 100) + 50;
            telefono = "614" + Integer.toString((int) (Math.random() * 9999999));

            uid = "1 1 1 " + Integer.toString(i);
            /*
            System.out.println(i);
            System.out.println(nombre);
            System.out.println(apePat);
            System.out.println(apeMat);
            System.out.println(Integer.toString(dia) + "-" + Integer.toString(mes) +"-" + Integer.toString(anno));
            System.out.println(telefono);
            System.out.println(peso);
            System.out.println(uid);
            
            System.out.println("");
             */

            try {
                PreparedStatement insertar;

                insertar = conection.prepareStatement("INSERT INTO " + "usuarios" + "(id_usuario, nombre, ap_pat, ap_mat, fecha_nac, telefono, peso, uid) VALUES(?,?,?,?,?,?,?,?)");

                insertar.setInt(1, i);
                insertar.setString(2, nombre);
                insertar.setString(3, apePat);
                insertar.setString(4, apeMat);
                insertar.setString(5, Integer.toString(anno) + "-" + Integer.toString(mes) + "-" + Integer.toString(dia));
                insertar.setString(6, telefono);
                insertar.setString(7, Integer.toString(peso));
                insertar.setString(8, uid);

                insertar.execute();
                System.out.println("Generado: " + i);

            } catch (SQLException ex) {
                System.out.println("valio");
            }

        }

    }

}
