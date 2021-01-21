import javax.swing. *;
import java.util.Arrays;

public class Factorial {

    public static void main(String[] args) {

        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero")); // automaticamente parseo el numero que ingresa el usuario

        for(int i=numero;i>0;i--){
            resultado = resultado * i;
        }

        System.out.println("El factorial de el numero ingresado es: " + resultado);
    }
}


// double tipo de dato que admite decimales