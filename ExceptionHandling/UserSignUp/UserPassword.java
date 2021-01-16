package Com.UserSignUp;

/**
 *
 * @author Sadusha
 */
public class UserPassword {

    public void validateUserPassword(String password) throws Exception {
        try {
            System.out.println("Password added Successfully");
            UserDOB userDOB = new UserDOB();
            userDOB.validateDOB(password);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("not a valid password",e);
        }
    }
}
