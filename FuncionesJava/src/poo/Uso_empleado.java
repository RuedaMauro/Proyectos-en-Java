package poo;
// dos clases diferente en un mismo fichero
import java.util.*;

public class Uso_empleado {
    public static void main(String[] args) {

/*
        Empleado empleado1 = new Empleado("Mauro Rueda", 20000, 2002,10,5);
        // instanciar la clase empleado
        Empleado empleado2 = new Empleado("Camilo Robles", 56000, 2001,4,18);

        Empleado empleado3 = new Empleado("Rodrigo Lima", 15000, 2010,7,3);

        empleado1.aumentoDeSueldo(5);
        empleado2.aumentoDeSueldo(5);
        empleado3.aumentoDeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() +
                " Fecha de alta: " + empleado1.dameFechaContrato());

        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() +
                " Fecha de alta: " + empleado2.dameFechaContrato());

        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() +
                " Fecha de alta: " + empleado3.dameFechaContrato());
*/


        Empleado[] misEmpleados = new Empleado[3];
        // para usar varios tipos de variable primero crear la clase y despues al array pasarle los parametros
        misEmpleados[0]= new Empleado("Mauro Rueda",20000,2002,10,5);
        misEmpleados[1]= new Empleado("Camilo Robles", 56000, 2001,4,18);
        misEmpleados[2]= new Empleado("Rodrigo Lima", 15000, 2010,7,3);

        /*
        for(int i=0; i<3; i++){
            misEmpleados[i].aumentoDeSueldo(5);
        }

        for(int i=0;i<3;i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "Sueldo; " + misEmpleados[i].dameSueldo()
            + "Fecha de incorporacion: " + misEmpleados[i].dameFechaContrato());
        }
*/
        for(Empleado e: misEmpleados){
            e.aumentoDeSueldo(5);
        }

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
            + " Fecha de incorporacion: " + e.dameFechaContrato());
        }

    }
}


class Empleado{
    public Empleado(String nom, double sue, int año, int mes, int dia){ // Parametros para la clase empleado

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia); // Constructor calendario
        altaContrato = calendario.getTime(); // me devulve la fecha

    }

    public Empleado(String nom){
        this(nom, 30909, 1992, 5, 6);
    }

    public String dameNombre(){ // getter
        return nombre;
    } // siempre los getter tienen que retornar, y en los setter no, tienen que ser void

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

    private String nombre;
    private double sueldo;
    private Date altaContrato; // "java.util.*;" exporto todo el paquete

}