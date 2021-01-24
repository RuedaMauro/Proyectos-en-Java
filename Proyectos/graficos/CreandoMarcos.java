package graficos;
import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
    public static void main(String[] args) {

    miMargo marco1 = new miMargo();

    marco1.setVisible(true); // hace visible la ventana

    marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // cuando se cierre la ventana el programa tiene que terminar
    }
}

class miMargo extends JFrame{   // implica que dentro de esta clase puedo usar todos los metodos de jFrame

    public miMargo(){
/*
        setSize(500,300);   // tamaño de la ventana

        setLocation(500,300);  // eje de coordenadas
*/
        setBounds(500,300,254,250); // estable los dos metodos anteriios juntos

        setResizable(false); // impide redimencionar, no deja que se pueda expandir la ventana

        setExtendedState(Frame.MAXIMIZED_BOTH); // agranda la ventana

        setTitle("Mi ventana");
    }
}