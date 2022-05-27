package uaslp.objetos.figuras;

import java.util.concurrent.TransferQueue;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double area;

    public  Triangulo()
    {
        super("Triangulo");
    }

    public Triangulo(double base,  double altura)
    {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String name)
    {
        super(name);
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getArea()
    {
        area = base * altura / 2;
        return area;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltura()
    {
        return altura;
    }

    public String getDescription()
    {
        return "Cualquier triangulo";
    }
}
