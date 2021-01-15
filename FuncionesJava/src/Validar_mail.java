import javax.swing. *;
import java.util.Arrays;

public class Validar_mail {
    public static void main(String[] args) {

        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Introduce tu mail");

        for(int i=0;i<mail.length();i++){ // recorre la cadena caracter por caracter

            if(mail.charAt(i)=='@'){ // charAt evalua el primer caracter desde 0
                 arroba = true;
            }
        }

        if(arroba==true){
            System.out.println("El mail es correcto, bienvenido");
        }else{
            System.out.println("Error 404, not found");
        }

        System.out.println(mail.length());
        // Lenght longitud, cantidad de caracteres
    }

}
