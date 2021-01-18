package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
public class SSF extends TaxHandler {
    //4%
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.04);
        System.out.print("SSF Calculated , ");
        return invoice.getTax();
    }
}
