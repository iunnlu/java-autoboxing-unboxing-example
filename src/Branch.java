import java.util.ArrayList;

public class Branch {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    String name;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printCustomers() {
        if(customers.size() != 0) {
            for(int i=0; i<customers.size(); i++) {
                System.out.println((i+1) + ". customer : " + customers.get(i).getName() + " -> " + customers.get(i).getTransactions());
            }
        } else {
            System.out.println("There aren't any customers in this branch");
        }
    }

    public void addNewCustomer(String name) {
        Customer newCustomer = new Customer(name);
        if(findCustomer(name) == null) {
            customers.add(newCustomer);
        } else {
            System.out.println("The customer who you want to add is already exist in the customers list.");
        }
    }

    public void addTransaction(String name, double value) {
        if(findCustomer(name) != null) {
            findCustomer(name).addNewTransaction(value);
        } else {
            System.out.println("Your account was not found.");
        }
    }

    public Customer findCustomer(String name){
        for(int i=0; i<customers.size(); i++) {
            if(customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
