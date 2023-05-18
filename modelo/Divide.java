package modelo;

public class Divide extends Operacion{
    // Constructor
    public Divide(double x, double y) {
        super(x, y);
    }

    // Métodos
    public void dividir()
    {
        resultado = x / y;
    }
    
}
