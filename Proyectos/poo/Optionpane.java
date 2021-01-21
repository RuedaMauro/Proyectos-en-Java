import javax.swing. *;
import java.util.Arrays;

public class Optionpane {

    public static void main(String[] args) {

    String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre porfavor");
    // Cuadro de texto lo que el usuario escriba en esta ventana se almacenara en nombre_usuario

    String edad = JOptionPane.showInputDialog("introduce tu edad");
    int edad_usuario = Integer.parseInt(edad);       // Parsear un String
    edad_usuario++;
        System.out.println("Hola " + nombre_usuario + ". Dentro de 1 año tendras " + edad_usuario);

    }

}

/*
    todos los metodos javax swing son estaticos
    showInputDialog recibe un String no es un tipo de dato es un objeto perteneciente a la clase string



 */