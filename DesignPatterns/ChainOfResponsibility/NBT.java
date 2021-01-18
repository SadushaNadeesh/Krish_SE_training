package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
public class NBT extends TaxHandler {
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.02);
        System.out.print("NBT Calculated , ");
        if(invoice.getAmount()>=100 && invoice.getAmount()<=200){
            return invoice.getTax();
        }else{
            return successor.applyTax(invoice);
        }
    }
}
