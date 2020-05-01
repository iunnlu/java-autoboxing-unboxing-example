public class Main {
    public static void main(String[] args) {
        Bank yapikredi = new Bank("Yapıkredi");
        Branch kasimpasa = new Branch("Kasımpaşa");
        yapikredi.addNewBranch(kasimpasa);
        yapikredi.addNewBranch("Çağlayan");
        yapikredi.addNewCustomer("Kasımpaşa", "İlhan Ünlü");
        kasimpasa.addNewCustomer("Ahmet Çakar");
        kasimpasa.addTransaction("İlhan Ünlü", 15);
        kasimpasa.addTransaction("İlhan Ünlü", 25);
        yapikredi.addNewTransiction("Kasımpaşa", "İlhan Ünlü", 5);
        yapikredi.printCustomers("Kasımpaşa");
    }
}
