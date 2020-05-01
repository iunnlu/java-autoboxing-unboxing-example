import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void addNewBranch(Branch newBranch) {
        if(findBranch(newBranch.getName()) == null) {
            branches.add(newBranch);
        } else {
            System.out.println("The branch you want to create is already exists.");
        }
    }
    public void addNewBranch(String name) {
        Branch newBranch = new Branch(name);
        if(findBranch(name) == null) {
            branches.add(newBranch);
        } else {
            System.out.println("The branch you want to create is already exists.");
        }
    }
    public void printBranch(){
        if(branches.size() != 0) {
            for(int i=0; i<branches.size(); i++) {
                System.out.println((i+1) + ". branch : " + branches.get(i).getName());
            }
        } else {
            System.out.println("There arent any branch in this bank.");
        }
    }
    public void printCustomers(String branchName) {
        if(findBranch(branchName) != null) {
            findBranch(branchName).printCustomers();
        } else {
            System.out.println("The branch you want to print doesnt exist in the branch list.");
        }
    }
    public void addNewCustomer(String branchName, String customerName) {
        if(findBranch(branchName) != null) {
            findBranch(branchName).addNewCustomer(customerName);
        } else {
            System.out.println("The customer you want to add doesnt find in the branches list.");
        }
    }
    public void addNewTransiction(String branchName, String customerName, double value) {
        if(findBranch(branchName) != null){
            if(findBranch(branchName).findCustomer(customerName) != null) {
                findBranch(branchName).addTransaction(customerName, value);
            } else {
                System.out.println("The customer you want to search doenst find in the exist customer list");
            }
        } else {
            System.out.println("The branch you want to search doenst find in the branch list.");
        }
    }
    private Branch findBranch(String name) {
        for(int i=0; i<branches.size(); i++) {
            if(branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }
}
