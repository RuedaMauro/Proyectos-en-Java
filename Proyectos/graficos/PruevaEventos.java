package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PruevaEventos {
    public static void main(String[] args) {
        MarcoConBotones nuevoMarco = new MarcoConBotones();
        nuevoMarco.setVisible(true);
        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConBotones extends JFrame{
    public MarcoConBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        LaminaConBotones nuevaLamina = new LaminaConBotones();
        add(nuevaLamina);
    }
}

class LaminaConBotones extends JPanel{

    JButton botonAzul = new JButton("Azul");  // contructor de botonoes
    JButton botonRojo = new JButton("Rojo");  // contructor de botonoes
    JButton botonAmarillo = new JButton("Amarillo");  // contructor de botonoes

    public LaminaConBotones() {

        add(botonAzul);
        add(botonRojo);
        add(botonAmarillo);

        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        ColorFondo Azul = new ColorFondo(Color.BLUE);

        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);


/*
    public void actionPerformed(ActionEvent e){

        Object botonPulsado = e.getSource();

        if(botonPulsado == botonAzul){
            setBackground(Color.BLUE);
        }else if(botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW);
        }else if(botonPulsado == botonRojo){
            setBackground(Color.RED);
        }else{
            setBackground(Color.PINK);
        }


    }
*/

    }

    private class ColorFondo implements ActionListener {
        public ColorFondo(Color c) {
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }
        private Color colorDeFondo;
    }

}

