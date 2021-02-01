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

class LaminaConBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");  // contructor de botonoes
    JButton botonRojo = new JButton("Rojo");  // contructor de botonoes
    JButton botonAmarillo = new JButton("Amarillo");  // contructor de botonoes
    public LaminaConBotones(){

        add(botonAzul);
        add(botonRojo);
        add(botonAmarillo);

        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }

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

}
