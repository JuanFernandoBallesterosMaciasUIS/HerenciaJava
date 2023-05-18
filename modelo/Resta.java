package modelo;

public class Resta extends Operacion{
    // Constructor
    public Resta(double x, double y) {
        super(x, y);
    }

    // Métodos
    public void restar()
    {
        resultado = x - y;
    }
    
}
