package FactoryMethod;

/**
 *
 * @author Sadusha
 */
public class PackageFactory {

    public static DataPackage createPackage(PackageCode packageCode) {
        switch (packageCode) {
            case BASIC:
                return new BasicPackage();
            case BLASTER:
                return new Blaster();
            default:
                return null;
        }
    }
}
