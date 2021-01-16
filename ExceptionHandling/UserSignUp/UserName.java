package Com.UserSignUp;

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
            }
        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("not a valid username",e);
        }
    }
}