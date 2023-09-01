package exe2;

import static exe2.CalculateArea.*;

public class Main {
    public static void main(String[] args) {
        double ladoQuadrado = 5.0;
        double baseTriangulo = 8.0;
        double alturaTriangulo = 6.0;
        double raioCircunferencia = 3.0;

        double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        double areaCircunferencia = calcularAreaCircunferencia(raioCircunferencia);

        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Triângulo: " + areaTriangulo);
        System.out.println("Área da Circunferência: " + areaCircunferencia);
    }
}
