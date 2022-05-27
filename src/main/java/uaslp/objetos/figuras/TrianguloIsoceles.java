package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo{

    public TrianguloIsoceles()
    {
        super("Triangulo Isoceles");
    }

    @Override
    public String getDescription() {
        return "2 Lados iguales y 1 diferente";
    }
}
