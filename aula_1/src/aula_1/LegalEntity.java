package aula_1;

public class LegalEntity extends person {
    private String cnpj;

    public LegalEntity(String name, String phoneNumber, String email, String address, double discountValue, String cnpj) {
        super(name, phoneNumber, email, address, discountValue);
        this.cnpj = cnpj;
    }

    @Override
    public void calculateDiscount(double percentDiscount) {
        discountValue = percentDiscount * 0.01 + 0.20; // Legal Entity + 20%
    }

    @Override
    public void printPersonalInformation() {
        super.printPersonalInformation();
        System.out.println("CNPJ: " + cnpj);
    }
}
