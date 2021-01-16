package Com.UserSignUp;

/**
 *
 * @author Sadusha
 */
public class UserDOB {

    public void validateDOB(String dob) throws Exception {
        try {
            System.out.println("DOB added Successfully");
            UserAddress userAddress = new UserAddress();
            userAddress.validateAddress(dob);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("Not a valid DOB",e);
        }
    }
}