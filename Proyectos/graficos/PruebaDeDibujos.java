package graficos;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaDeDibujos {

    public static void main(String[] args) {

        MarcoConDibujo miMarco = new MarcoConDibujo();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
// marco
class MarcoConDibujo extends JFrame{

    public MarcoConDibujo(){
        setTitle("Prueba de Dibujo");
        setSize(400,400);

        LaminaConDibujo miLamina = new LaminaConDibujo(); // instancia lamina

        add(miLamina); // agregamos la lamina

    }
}
// lamina nueva
class LaminaConDibujo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        File miImagen = new File("Proyectos/graficos/imagenR.png");

        try {
            imagen = ImageIO.read(miImagen);

        /*
        g.drawRect(50,50,200,200); // funcion para dibujar dentro de la lamina
        */
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }

        g.drawImage(imagen, 5, 5, null);

    }
    private Image imagen; // variable de tipo imagen

}