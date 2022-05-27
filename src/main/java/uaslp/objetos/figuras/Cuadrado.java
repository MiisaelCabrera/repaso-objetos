package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;
    private double area;

    public Cuadrado()
    {
        super("Cuadrado");
    }

    public Cuadrado(double lado)
    {
        super("Cuadrado");
        this.lado = lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }
    public double getArea()
    {
        if(lado == 0)
            throw new LadoNoProvistoException();
        area = lado * lado;
        return area;
    }

    public double getLado()
    {
        return lado;
    }
}
