package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventosDeFoco {
    public static void main(String[] args) {
        MarcoF nMarco = new MarcoF();
        nMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoF extends JFrame{
    public MarcoF(){
        setVisible(true);
        setBounds(300,300,600,450);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel{
    // ambito de variables por el tema de la herencia

    JTextField cuadro1;
    JTextField cuadro2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null); // invalida la posicion de los elementos por defecto puedo hacerlo donde quiera
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
        cuadro2.addFocusListener(elFoco);
    }
    private class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Se perdio la ventana");
        }
    }

}
// FocusListener desencadenan una accion cuando el componente agarra cualquier foco o cuando el componente pierde el foco

