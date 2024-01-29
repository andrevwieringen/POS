public class Main {

    static public void main(String args[]){
        ProductCatalog catalog = new ProductCatalog();
        Inventory inventory = new Inventory();
        Accounting accounting = new Accounting();
        PaymentTerminal terminal = new PaymentTerminal(catalog,inventory,accounting);
    }
}
