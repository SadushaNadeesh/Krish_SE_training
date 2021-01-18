package userSignUp;

import exceptions.ValidDOBException;

/**
 *
 * @author Sadusha
 */
public class UserDOB {

    public void validateDOB(String dob) throws Exception {
        try {
            if (!dob.isEmpty()) {
                System.out.println("DOB added Successfully");
                UserAddress userAddress = new UserAddress();
                userAddress.validateAddress("Galle");
            } else {
                throw new ValidDOBException("Not a Valid DOB");
            }
        } catch (ValidDOBException e) {
            System.out.println("Exception caused by : " + e);
            //e.printStackTrace();
        }
    }
}