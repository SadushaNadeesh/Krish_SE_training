package FactoryMethod;

/**
 *
 * @author Sadusha
 */
public class BasicPackage extends DataPackage{

    @Override
    protected void createPackage() {
        dataBundles.add(new WorkFromHome());
    }
    
}
