package ie.atu;

public class Customer {
    public String customerNumber;
    public boolean mailingList;

    public Customer() {//default constructor

    }

    public Customer(String customerNumber, boolean mailingList) {
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}
