package poo;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Mauro");
        Empleados trabajador2 = new Empleados("Carlos");
        trabajador1.CambiaSeccion("RRHH");
        System.out.println(trabajador1.nombreEmpleado() + "\n" + trabajador2.nombreEmpleado());

        System.out.println(Empleados.dameIdSiguiente());

        // SI LE DAMOS ESTADO INICIAL A UN OBJETO NO TIENE SENTIDO VOLVER A CAMBIARLO

    }
}


