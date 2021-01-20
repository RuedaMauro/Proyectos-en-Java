import java.util. *;


public class Entrada_salida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce una edad por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");


    }

}





// IGU Interfaz grafica de usuario (formulario que nos hace ver la informacion del programa)
// swing
// awt
// Scanner utiliza la consola como entrada y salida nextLine() nextInt()  nextDouble() no son estaticos, exigen que utilices un objeto perteneciente a la clase scanner
// JOptionPane showInputDialog metodo estatico, implica que tenemos que usar el nombre de la clase delante del metedo
/*
System.in consola del sistema para ingresar informacion


 */