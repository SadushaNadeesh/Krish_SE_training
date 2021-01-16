package Com.UserSignUp;

import Com.Exceptions.UserAlreadyExistException;

/**
 *
 * @author Sadusha
 */
public class UserAddress {

    public void validateAddress(String address) throws Exception {
        if (address != null) {
        }
        try {
            throw new UserAlreadyExistException("User Already Exists");
        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("Exception Caused By : ",e);
        }
    }
}