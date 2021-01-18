package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
public class Tax extends TaxHandler {

    @Override
    public double applyTax(Invoice invoice) {
        return successor.applyTax(invoice);
    }
}