package FactoryMethod;

/**
 *
 * @author Sadusha
 */
public class PackageDetails {
    public static void main(String[] args) {
        DataPackage dataPackage = PackageFactory.createPackage(PackageCode.BASIC);
        System.out.println(dataPackage);
        DataPackage dataPackage2 = PackageFactory.createPackage(PackageCode.BLASTER);
        System.out.println(dataPackage2);
    }
}
