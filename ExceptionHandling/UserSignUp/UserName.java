package UserSignUp;

import Exceptions.ValidNameException;

/**
 *
 * @author Sadusha
 */
public class UserName {

    public void validateUserName(String name) throws Exception {
        try {
            if (name.length() == 10) {
                System.out.println("Name added Successfully");
                UserPassword userPassword = new UserPassword();
                userPassword.validateUserPassword(name);
            } else {
                throw new ValidNameException("Not a valid Name");
            }
        } catch (ValidNameException e) {
            System.out.println("Exception caused by : " + e.getMessage());
        }

    }
}