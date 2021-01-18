package FactoryMethod;

/**
 *
 * @author Sadusha
 */
public class Blaster extends DataPackage{

    @Override
    protected void createPackage() {
        dataBundles.add(new SocialMedia());
        dataBundles.add(new WorkFromHome());
    }
    
}
