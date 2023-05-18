package modelo;

public class Multiplica extends Operacion{

    // Constructor
    public Multiplica(double x, double y) {
        super(x, y);
    }

    // Métodos
    public void multiplica()
    {
        resultado = x * y;
    }
    
}
