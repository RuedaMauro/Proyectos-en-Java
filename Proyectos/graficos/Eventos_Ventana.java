package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {
    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoVentana extends JFrame{
    public MarcoVentana(){
        setTitle("Respondiendo");
        setBounds(300,300,300,300);
        setVisible(true);
        M_Ventana oyente_ventana = new M_Ventana(); // INSTANCIA
        addWindowListener(oyente_ventana); // evento del tipo ventana
    }
}

// Windows Listener eventos de ventana

class M_Ventana implements WindowListener{ // clase oyente
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent  e){

    }
    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando Ventana");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Ventana abierta");
    }
}
