package paquetepruebas;
import java.util.*;
public class Uso_Tallas {
    // enum Talla{MINI, MEDIANO,GRANDE, MUY_GRANDE}

    enum Talla{ // contructor con enum

        MINI("S"),MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }

        private String abreviatura;
    }

    public static void main(String[] args) {
    /*    Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla x = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
    */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un talle: MINI, MEDIANO, GRANDE, MUY GRANDE");

        String entrada_datos = entrada.next().toUpperCase();

        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos); // pide dos parametros la clase y una constante

        System.out.println("TALLA = " + la_talla);
        System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
    }

}
