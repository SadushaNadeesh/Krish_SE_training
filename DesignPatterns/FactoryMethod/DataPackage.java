package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadusha on 1/18/2021.
 */
public abstract class DataPackage {
    protected List<DataBundle> dataBundles = new ArrayList<>();

    public DataPackage() {
        createPackage();
    }

    protected abstract void createPackage();

    @Override
    public String toString() {
        return "Package{" + "dataBundles=" + dataBundles + '}';
    }

}