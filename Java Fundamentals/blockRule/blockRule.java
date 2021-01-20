package blockRule;

/**
 *
 * @author Sadusha
 */
public class blockRule {

    static int classLevel = 10;

    public static void main(String[] args) {
        System.out.println("Before block " + classLevel);

        //this is how you can all block
        {
            int classLevel = 20;
            System.out.println("Inside block " + classLevel);
        }
        System.out.println("Outside block " + classLevel);
    }
}
/*
Before block 10
Inside block 20
Outside block 10
*/