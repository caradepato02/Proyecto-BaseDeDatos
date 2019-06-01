package GeneratorDatos;


import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalo_
 */
public class ArduinoConnection extends PanamaHitek_Arduino{

    private static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    private SerialPortEventListener listener;

    public ArduinoConnection() {

        listener = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent spe) {
                try {
                    if (ino.isMessageAvailable()) {

                        System.out.println(ino.printMessage());

                    }
                } catch (SerialPortException ex) {
                    Logger.getLogger(ArduinoConnection.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArduinoException ex) {
                    Logger.getLogger(ArduinoConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        for (String serialPort : ino.getSerialPorts()) {
            System.out.println(serialPort);
        }
        try {
            ino.arduinoRXTX("COM3", 9600, listener);
        } catch (ArduinoException ex) {
            Logger.getLogger(ArduinoConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SerialPortEventListener getListener() {
        return listener;
    }

   

}
