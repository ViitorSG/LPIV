package aula2.exe1;

public class division {

    public static void main(String[] args) {
        try {
            doDivision(10, 0);
        } catch (CustomException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            System.out.println("Código executado completamente.");
        }
    }

    public static void doDivision(int dividendo, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Divisão por zero não permitida.");
        }
        int result = dividendo / divisor;
        System.out.println("Resultado da divisão: " + result);
    }
}