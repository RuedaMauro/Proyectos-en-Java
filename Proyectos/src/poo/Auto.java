package poo;
import javax.swing.*;
// objeto
public class Auto {
// solo se deben poder manipularse mediante los setters
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    // es true o false si es que posee una de estas propiedades
    private boolean asientos_cuero, climatizador;

    // propiedades

    public Auto(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    // metodo getter
    public String dime_color(){
        return "El color del auto es " + color;
    }

    // metodo setter
    public void color_auto(String establecer_color){
        color = establecer_color;
    }
    // metodo getter
    public String dime_caracteristicas_generales(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas. Mide " + largo/1000
                + " metros con un ancho de " + ancho + "cm y un peso de plataforma de " + peso_plataforma
                + " kg.";
    }

    public void configura_asientos(String asientos_cuero){ // setter
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos(){
        if(asientos_cuero == true){
            return "El auto lleva asientos";
        }else{
            return  "El auto no lleva asientos";
        }
    }

    public void configura_climatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
           this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public String dime_climatizador(){
        if(climatizador==true){
            return "El auto tiene climatizador";
        }else{
            return "El auto no tiene climatizador";
        }
    }
    

}
