import java.util.ArrayList;

public class Customer {
    ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addNewTransaction(double newValue) {
        transactions.add(Double.valueOf(newValue));
    }
}
