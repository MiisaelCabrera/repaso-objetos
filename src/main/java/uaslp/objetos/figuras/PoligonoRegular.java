package uaslp.objetos.figuras;

import java.lang.Math;

public class PoligonoRegular extends Figura{
    private int numeroDeLados;
    private  double lado;
    private double area;

    public PoligonoRegular(int numeroDeLados)
    {
        super("Poligono Regular");

        if(numeroDeLados < 5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");

        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado)
    {
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getArea()
    {
        double angle = Math.toRadians(180/numeroDeLados);
        angle = Math.tan(angle);

        area = (lado * lado * numeroDeLados)/(4 * angle);
        return  area;
    }

    public double getLado() {
        return lado;
    }
}
