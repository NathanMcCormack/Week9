package ie.atu;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Nathan", "Newcastle", "083 555", "4455", true);
        Customer customer2 = new Customer();

        customer2.setName("Eoin");
        customer2.setAddress("Galway");
        customer2.setPhone("5555");
        customer2.setCustomerNumber("1234");
        customer2.setMailingList(false);

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

    }
}