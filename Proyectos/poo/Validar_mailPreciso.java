import javax.swing. *;
import java.util.Arrays;


public class Validar_mailPreciso {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto= false;

        String mail = JOptionPane.showInputDialog("Ingrese su mail");

        for(int i = 0; i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                punto = true;
            }
        }

        if(arroba==1 && punto == true){
            System.out.println("Bienvenido!!!...");
        }else{
            System.out.println("Error 404 not found");
        }

    }
}
