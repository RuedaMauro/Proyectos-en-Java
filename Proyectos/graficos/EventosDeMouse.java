package graficos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

    }
}

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