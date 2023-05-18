package modelo2;

public class Circulo extends Figura{

    // Atributos
    private double radio;

    // Constructor
    public Circulo(double perimetro, double area, double radio) {
        super(perimetro, area);
        this.radio = radio;
    }

    public void calcularAreaPerimetro(double radio) {
        this.radio = radio;
        this.perimetro = 2 * Math.PI * radio;
        this.area = Math.PI * Math.pow(radio, 2);
    }
}
