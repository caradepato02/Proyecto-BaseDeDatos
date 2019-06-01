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
public class EntrenadorGenerator {

    private Connection conection;
    private int cant;
    private int numName;
    private int numApePat;
    private int numApeMat;
    private int dia, mes, anno;
    private String sexo;
    private String telefono;
    private String nombre, apePat, apeMat;
    private String uid;
    private String user;
    private String pass;

    public EntrenadorGenerator(int cant) {
        this.cant = cant;

        Conection conexion = new Conection();
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
                    sexo = "Masculino";

                    break;
                case 1:
                    nombre = "Alondra";
                    sexo = "Femenino";
                    break;
                case 2:
                    nombre = "Diego";
                    sexo = "Masculino";
                    break;
                case 3:
                    nombre = "Emiliano";
                    sexo = "Masculino";
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

            telefono = "614" + Integer.toString((int) (Math.random() * 9999999));

            uid = "1 1 1 " + Integer.toString(i);

            try {
                PreparedStatement consulta;

                consulta = conection.prepareStatement("INSERT INTO " + "entrenadores" + "(nombre, ape_pat, ape_mat, fecha_nac, telefono, sexo,id_tarjeta) VALUES(?,?,?,?,?,?,?)");

                consulta.setString(1, nombre);
                consulta.setString(2, apePat);
                consulta.setString(3, apeMat);
                consulta.setString(4, Integer.toString(anno) + "-" + Integer.toString(mes) + "-" + Integer.toString(dia));
                consulta.setString(5, telefono);
                consulta.setString(6, sexo);
                consulta.setInt(7, i);

                consulta.execute();
                System.out.println("Generado: " + i);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

}
