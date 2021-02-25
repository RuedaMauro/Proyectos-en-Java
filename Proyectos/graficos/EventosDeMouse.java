package graficos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventosDeMouse {
    public static void main(String[] args) {
        MarcoConMouse nuevoMarco = new MarcoConMouse();
        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoConMouse extends JFrame{  // Objeto Fuente
    public MarcoConMouse(){     // Constructor implementado
        setVisible(true);
        setBounds(700,300,600,450);

        EventosDeRaton EventoRaton = new EventosDeRaton();
        addMouseListener(EventoRaton); // Pone a la escucha al oyente
   //    addMouseMotionListener(EventosDeR);  oyente de motionListener
    }
}





class EventosDeRaton extends MouseAdapter {  // Objeto oyente
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Pulsaste el click izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Pulsaste la rueda del boton");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Pulsaste el click derecho");
        }
    }
}

class EventosDeR implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("El mouse se esta arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el mouse");
    }
}

    /*

    public void mouseClicked(MouseEvent e){ // recibe por parametro presisamente un objeto perteneciente a mouseevent
     //   System.out.println("Coordenada X: " + e.getX() + " Coordenada en Y: " + e.getY()); // Posicion del raton en una ventana
    //    System.out.println(e.getClickCount());  Detectar si el usuario hizo una cantidad de clicks
    }
}

    /*

/*
class EventosDeRaton implements MouseListener{  // Objeto oyente

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hiciste un click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Estas presionando el click");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Estas levantando el click");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}
MouseMotionListener


     */
