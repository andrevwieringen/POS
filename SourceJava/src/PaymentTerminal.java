public class PaymentTerminal {

    private ProductCatalog catalog;
    private Inventory inventory;
    private Accounting accounting;

    public PaymentTerminal(ProductCatalog catalog,Inventory inventory, Accounting accounting){
        this.catalog = catalog;
        this.inventory = inventory;
        this.accounting = accounting;
    }
}
