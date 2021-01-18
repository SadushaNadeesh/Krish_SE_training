package stackTrace;

import userSignUp.UserName;

/**
 *
 * @author Sadusha
 */
public class UserSignUp {

    public void signUp(){
        try {
            UserName userName = new UserName();
            userName.validateUserName("Sadusha123");
        } catch (Exception e) {
            System.out.println("Exception caused by : "+e);
            //System.err.println(e);
            //e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        UserSignUp userSignUp = new UserSignUp();
        userSignUp.signUp();
    }
}