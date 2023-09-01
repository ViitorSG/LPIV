package aula_1;


public class Individual extends person {
    private String cpf;

    public Individual(String name, String phoneNumber, String email, String address, double discountValue, String cpf) {
        super(name, phoneNumber, email, address, discountValue);
        this.cpf = cpf;
    }

    @Override
    public void calculateDiscount(double percentDiscount) {
        discountValue = percentDiscount * 0.01 + 0.10;
    }

    @Override
    public void printPersonalInformation() {
        super.printPersonalInformation();
        System.out.println("CPF: " + cpf);
    }
}