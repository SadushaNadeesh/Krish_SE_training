package UserSignUp;

import Exceptions.ValidAddressException;

/**
 *
 * @author Sadusha
 */
public class UserAddress {

    public void validateAddress(String address) throws Exception {
        try {
            if (address.length() > 5) {
                System.out.println("User added successfully");
            } else {
                throw new ValidAddressException("Not a valid address");
            }
        } catch (ValidAddressException e) {
            System.out.println("Exception caused by : " + e.getMessage());
        }
    }
}