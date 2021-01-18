package userSignUp;

import exceptions.ValidPasswordException;

/**
 *
 * @author Sadusha
 */
public class UserPassword {

    public void validateUserPassword(String password) throws Exception {
        try {
            if (password.length() >= 10) {
                System.out.println("Password added Successfully");
                UserDOB userDOB = new UserDOB();
                userDOB.validateDOB("17th of January");
            } else {
                throw new ValidPasswordException(password);
            }
        } catch (ValidPasswordException e) {
            System.out.println("Exception caused by : " + e.getMessage());
            //e.printStackTrace();
        }
    }
}