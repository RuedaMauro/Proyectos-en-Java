package graficos;
import javax.swing.*;
import java.awt.*;


public class MarcoConTexto {

    public static void main(String[] args) {

        Mtexto nuevoMarco = new Mtexto();

        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Mtexto extends JFrame{

    public Mtexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);

        setTitle("Primeros textos");

        Lamina nuevaLamina = new Lamina();
        add(nuevaLamina);
    }

}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g); // llama a la clase paint component
        g.drawString("primer texto en swing",100,100); // dibuja dentro de la lamina

    }

}