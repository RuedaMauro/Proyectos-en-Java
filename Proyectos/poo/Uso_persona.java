package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {
    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Armando",46000,2006,6,5);
        lasPersonas[1] = new Alumno2("Nicolas","Ing en Sistemas");

        for(Persona p: lasPersonas){
            System.out.println(p.dameNombre() + p.dameDescripcion());
        }
    }
}

abstract class Persona{

    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;

}


class Empleado2 extends Persona{
    public Empleado2(String nom, double sue, int año, int mes, int dia){ // Parametros para la clase empleado
        super(nom);

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia); // Constructor calendario
        altaContrato = calendario.getTime(); // me devulve la fecha
        ++IdSiguiente;
        Id = IdSiguiente;

    }

    public String dameDescripcion(){
        return " es un empleado y tiene un ID = " + Id + " con un sueldo de " + sueldo;
    }

    public double dameSueldo(){ // getter
        return sueldo;
    }

    public Date dameFechaContrato() { // getter
        return altaContrato;
    }

    public void aumentoDeSueldo(double porcentaje){ // setter
        double aumento = sueldo * porcentaje / 100;
        sueldo+=aumento;
    }

    private double sueldo;
    private Date altaContrato; // "java.util.*;" exporto todo el paquete
    private int Id;
    private static int IdSiguiente;
}

class Alumno2 extends Persona{
    public Alumno2(String nom, String car){

        super(nom);
        carrera = car;
    }
    public String dameDescripcion(){
        return " es un alumno que esta estudiando la carrera de " + carrera;
    }
    private String carrera;
}

