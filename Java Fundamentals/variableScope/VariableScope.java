package variableScope;

/**
 *
 * @author Sadusha
 */
public class VariableScope {

    int classlevel;

    public void demo() {
        int methodlevel;

        for (int i = 0; i < 10; i++) {
            int blocklevel;

            //all variables can be access from here.
            classlevel = 0;
            methodlevel = 1;
            blocklevel = 2;

        }
        //block level not visible to upper class
        //blocklevel=3;

        //class level visible as its super for method
        classlevel = 2;
    }
    //method level not visible to upper level
    //classlevlel=3;
}