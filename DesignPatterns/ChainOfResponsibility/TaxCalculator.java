package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
public class TaxCalculator {

    public static void main(String[] args) {
        VAT vat = new VAT();
        NBT nbt = new NBT();
        BTT btt = new BTT();
        SSF ssf = new SSF();
        Tax tax = new Tax();
        
        tax.setSuccessor(vat);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(ssf);
        
        Invoice invoice = new Invoice(1, 150);
        System.out.println(tax.applyTax(invoice));
        
        Invoice invoice1 = new Invoice(2, 250);
        System.out.println("\n"+tax.applyTax(invoice1));
        
        Invoice invoice3 = new Invoice(3, 550);
        System.out.println("\n"+tax.applyTax(invoice3));
    }
}
