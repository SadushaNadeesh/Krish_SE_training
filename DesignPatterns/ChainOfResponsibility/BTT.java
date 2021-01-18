package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
public class BTT extends TaxHandler {
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.03);
        System.out.print("BTT Calculated , ");
        if(invoice.getAmount()> 200 && invoice.getAmount()<=300){
            return invoice.getTax();
        }else{
            return successor.applyTax(invoice);
        }
    }
}
