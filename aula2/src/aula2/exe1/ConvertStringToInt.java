package aula2.exe1;

public class ConvertStringToInt {

    public static void main(String[] args) {
        try {
            convertStringToInt("abc");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void convertStringToInt(String texto) throws CustomException {
        try {
            Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new CustomException("Erro ao Converter string para Inteiro");
        }
    }
}