package ejecutable;
import javax.swing.JOptionPane;
import modelo.Suma; 
import modelo.Resta;
import modelo.Multiplica;
import modelo.Divide;
import modelo.Operacion;

public class Principal
{
    public static void main(String[] args) {

        // Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        // Creación de un objeto Suma
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma es: " + miSuma.mostrarResultado());

    }
}