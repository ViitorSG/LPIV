package exe2;

public class CalculateArea {
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCircunferencia(double raio) {
        return Math.PI * raio * raio;
    }

}
