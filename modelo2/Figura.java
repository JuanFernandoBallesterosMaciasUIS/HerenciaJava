package modelo2;

public class Figura {
    
    // Atributos
    protected double perimetro;
    protected double area;

    // Constructor
    public Figura(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    // Métodos
    public double mostrarPerimetro()
    {
        return this.perimetro;
    }

    public double mostrarArea()
    {
        return this.area;
    }
    
}
