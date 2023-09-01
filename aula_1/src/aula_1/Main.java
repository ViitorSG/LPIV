package aula_1;

public class Main {
    public static void main(String[] args) {
        person person = new person(
                "John",
                "123456789",
                "teste@gmail.com",
                "Street A",
                0
        );
        person.calculateDiscount(10);
        person.printPersonalInformation();

        Individual individual = new Individual(
                "John",
                "123456789",
                "john@example.com",
                "Street A",
                0,
                "123.456.789-00"
        );
        individual.calculateDiscount(15);
        individual.printPersonalInformation();

        LegalEntity legalEntity = new LegalEntity(
                "XYZ Company",
                "123456789",
                "xyzcontato@teste.com",
                "Avenue B",
                0,
                "12.345.678/0001-99"
        );
        legalEntity.calculateDiscount(10);
        legalEntity.printPersonalInformation();
    }
}