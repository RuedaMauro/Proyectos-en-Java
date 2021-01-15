import javax.swing.*;
import java.util.Arrays;

public class Entrada_Numeros {

    public static void main(String[] args) {

        String numero_ingresado = JOptionPane.showInputDialog("Introduce numero");
        double numero_guardado = Double.parseDouble(numero_ingresado);

        System.out.println("La raiz de " + numero_guardado);

        System.out.printf("%.2f", Math.sqrt(numero_guardado));

    }
}
// Math.sqrt metodo para hallar la raiz cuadrada de un numero

