package ejecutable;

import javax.swing.JOptionPane;
import modelo2.Rectangulo;
import modelo2.Circulo;
import modelo2.Figura;

public class Principal2 {
    public static void main(String[] args) {

        // Entrada de datos
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));

        // Creación de un objeto Rectangulo
        Rectangulo miRectangulo = new Rectangulo(0, 0, base, altura);
        miRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + miRectangulo.mostrarArea() + "\nEl perímetro del rectángulo es: " + miRectangulo.mostrarPerimetro());

        // Creación de un objeto Circulo
        Circulo miCirculo = new Circulo(0, 0, radio);
        miCirculo.calcularAreaPerimetro(radio);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + miCirculo.mostrarArea()
         + "\nEl perímetro del círculo es: " + miCirculo.mostrarPerimetro());

    }
    
}
