package aula_1;

public class person {
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String address;
    protected double discountValue;

    public person(String name, String phoneNumber, String email, String address, double discountValue) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.discountValue = discountValue;
    }

    public void calculateDiscount(double percentDiscount) {
        discountValue = percentDiscount * 0.01;
    }

    public void printPersonalInformation() {
        System.out.println("=====================================");
        System.out.println("Nome: " + name);
        System.out.println("Celular: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + address);
        System.out.println("Valor de desconto: " + discountValue);
    }
}
