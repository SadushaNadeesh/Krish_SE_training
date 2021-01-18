package ChainOfResponsibility;

/**
 *
 * @author Sadusha
 */
//Handler class
public abstract class TaxHandler {
    protected TaxHandler successor;

    public void setSuccessor(TaxHandler successor) {
        this.successor = successor;
    }
    
    public abstract double applyTax(Invoice invoice);
}
