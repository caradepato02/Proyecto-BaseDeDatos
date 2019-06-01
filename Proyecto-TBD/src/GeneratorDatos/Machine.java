package GeneratorDatos;


import Principal.Conection;
import Principal.Kalorik;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Machine {

    private Connection conection;
    private int id_machine;
    private int calorias;
    private int tiempo;
    private int id_user;
    private int dia;
    private int mes;
    private int anno;
    private int cant;
    private int select;
    private String user;
    private String pass;

    public Machine(int id_machine) {
        this.id_machine = id_machine;

        switch (id_machine) {
            case 0:
                calorias = (int) (Math.random() * 250);
                break;

        }
        tiempo = (int) (Math.random() * 120) + 1;
    }

    public Machine(int cant, int select) {
        this.cant = cant;
        this.select = select;

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
        switch (this.select) {
            case 1:
                for (int i = 1; i < this.cant; i++) {

                    calorias = (int) (Math.random() * 1000);
                    tiempo = (int) (Math.random() * 60);
                    id_machine = (int) (Math.random() * 49) + 1;
                    dia = (int) (Math.random() * 28) + 1;
                    mes = (int) (Math.random() * 11) + 1;
                    anno = 2019;
                    try {
                        Statement state = conection.createStatement();
                        ResultSet rs = state.executeQuery("SELECT id_usuario from usuarios order by RAND() limit 1 ");

                        while (rs.next()) {
                            id_user = rs.getInt("id_usuario");
                        }
                        state.close();

                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }

                    try {
                        PreparedStatement consulta;

                        consulta = conection.prepareStatement("INSERT INTO " + "estadisticas_usuario" + "(id_maquina, id_usuario, calorias, fecha, tiempo) VALUES(?,?,?,?,?)");

                        consulta.setInt(1, id_machine);
                        consulta.setInt(2, id_user);
                        consulta.setInt(3, calorias);
                        consulta.setString(4, Integer.toString(anno) + "-" + Integer.toString(mes) + "-" + Integer.toString(dia));
                        consulta.setInt(5, tiempo);
                        consulta.execute();
                        System.out.println("Generado: " + i);

                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }

                }
                break;

            case 2:

                String tipoMaquina;
                for (int i = 1; i < this.cant; i++) {
                    int ran = (int) (Math.random() * 5) + 1;

                    switch (ran) {
                        case 1:
                            tipoMaquina = "Prensa de pierna";
                            break;
                        case 2:
                            tipoMaquina = "Bicicleta";
                            break;
                        case 3:
                            tipoMaquina = "Cinta de correr";
                            break;
                        case 4:
                            tipoMaquina = "Maquina de remo";
                            break;
                        case 5:
                            tipoMaquina = "Banco press";
                            break;
                        default:
                            tipoMaquina = "Dorsalera";
                            break;
                    }

                    try {
                        PreparedStatement insertar;

                        insertar = conection.prepareStatement("INSERT INTO " + "maquinas" + "(tipo) VALUES(?)");

                        insertar.setString(1, tipoMaquina);
                        insertar.execute();
                        System.out.println("Generado: " + i);
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;

        }

    }

    public int getId_machine() {
        return id_machine;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getTiempo() {
        return tiempo;
    }

}
