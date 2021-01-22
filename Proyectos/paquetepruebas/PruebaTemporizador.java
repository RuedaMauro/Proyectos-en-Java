package paquetepruebas;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador {

    public static void main(String[] args) {

        Relog miRelog = new Relog(3000,true);
        miRelog.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

        System.exit(0);
    }
}

class Relog{

    public Relog(int intervalo, boolean solido){
        this.intervalo = intervalo;
        this.sonido = sonido;

    }

    public void enMarcha(){
        ActionListener oyente = new DameLahora();

        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    private int intervalo;
    private boolean sonido;

    private class DameLahora implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();

            System.out.println("El temporizador esta cada 3 segundos " + ahora);
            Toolkit.getDefaultToolkit().beep();

            if(sonido = true){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}