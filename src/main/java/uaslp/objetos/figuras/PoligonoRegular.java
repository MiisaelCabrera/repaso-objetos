package uaslp.objetos.figuras;

import java.lang.Math;

public class PoligonoRegular {
    private int numeroDeLados;
    private  double lado;
    private double area;

    public PoligonoRegular(int numeroDeLados)
    {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado)
    {
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
