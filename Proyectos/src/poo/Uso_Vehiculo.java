package poo;

import javax.swing.*;
import java.util.Arrays;

public class Uso_Vehiculo {
    public static void main(String[] args) {

       Auto miAuto1 = new Auto();

       miAuto1.color_auto(JOptionPane.showInputDialog("Ingrese un color:"));

       Furgoneta miFurgoneta = new Furgoneta(7,580);

       miFurgoneta.color_auto(JOptionPane.showInputDialog("Establece un color:"));

       miFurgoneta.configura_asientos("Si");
       miFurgoneta.configura_climatizador("si");

       System.out.println(miAuto1.dime_caracteristicas_generales() + " " + miAuto1.dime_color());
       System.out.println(miFurgoneta.dime_caracteristicas_generales() + " " + miFurgoneta.dimeDatosFurgoneta() + " " + miFurgoneta.dime_color());

        /*
        Auto Renault = new Auto(); // Ejemplar de la clase, Instanciar

      //System.out.println(Renault.dime_largo());

        Renault.color_auto(JOptionPane.showInputDialog("Introduce el color del auto"));

        System.out.println(Renault.dime_color());
        System.out.println(Renault.dime_caracteristicas_generales());

        Renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(Renault.dime_asientos());

        Renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(Renault.dime_climatizador());
        */
    }
}


