package StackTrace;

import UserSignUp.UserName;

/**
 *
 * @author Sadusha
 */
public class UserSignUp {
    public static void main(String[] args) {
        try {
            UserName userName = new UserName();
            userName.validateUserName("Sadusha123");
        } catch (Exception e) {
            System.out.println("Exception caused by : "+e);
        }
    }
}