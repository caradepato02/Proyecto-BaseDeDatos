package Principal;




import java.awt.CardLayout;
import java.sql.Connection;
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
public class Kalorik extends javax.swing.JFrame {

    /**
     * Creates new form Kalorik
     */
    
    private CardLayout cardLayout;
    private Connection conection;
    private Conection conexion;
    private String user;
    private String pass;
    
    public Kalorik() {
        initComponents();
        //Conectar a la base de datos
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

        setLocationRelativeTo(null);
        setSize(900, 800);
        
        
        //setFrame
        
        menu1.setFrame(this);
        vistaUsuario1.setFrame(this);
        maquinas1.setFrame(this);
        entrenadores1.setFrame(this);
        register1.setFrame(this);
        consultaUsuarios1.setFrame(this);
        
        
        cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "card2");
    }

    public Connection getConexion() {
        return conection;
    }
    
    public void setCard (int card){
        
        String cardx = "card" + card;
        cardLayout.show(getContentPane(), cardx);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrenadores2 = new Vistas.Entrenadores();
        menu1 = new Vistas.Menu();
        vistaUsuario1 = new Vistas.VistaUsuario();
        register1 = new Vistas.Register();
        entrenadores1 = new Vistas.Entrenadores();
        maquinas1 = new Vistas.Maquinas();
        consultaUsuarios1 = new Vistas.consultaUsuarios();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalorik");
        getContentPane().setLayout(new java.awt.CardLayout());

        menu1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menu1PropertyChange(evt);
            }
        });
        getContentPane().add(menu1, "card2");
        getContentPane().add(vistaUsuario1, "card3");
        getContentPane().add(register1, "card4");
        getContentPane().add(entrenadores1, "card5");
        getContentPane().add(maquinas1, "card6");
        getContentPane().add(consultaUsuarios1, "card7");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menu1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1PropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalorik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vistas.consultaUsuarios consultaUsuarios1;
    private Vistas.Entrenadores entrenadores1;
    private Vistas.Entrenadores entrenadores2;
    private Vistas.Maquinas maquinas1;
    private Vistas.Menu menu1;
    private Vistas.Register register1;
    private Vistas.VistaUsuario vistaUsuario1;
    // End of variables declaration//GEN-END:variables
}
