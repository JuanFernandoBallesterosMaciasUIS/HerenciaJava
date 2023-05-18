package modelo2;

public class Rectangulo extends Figura{

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double perimetro, double area, double base, double altura) {
        super(perimetro, area);
        this.base = base;
        this.altura = altura;
    }

    public void calcularAreaPerimetro(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.perimetro = 2 * (base + altura);
        this.area = base * altura;
    }

}
